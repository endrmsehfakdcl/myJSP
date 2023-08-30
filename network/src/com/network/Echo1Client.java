package com.network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Echo1Client {
	public static void main(String[] args) {
		Socket client = null;
		PrintWriter out = null;

		try {
			client = new Socket();
		} catch (Exception e) {
		}
		System.out.println("서버와 연결 시도중 ...");

		try {
			client.connect(new InetSocketAddress("127.0.0.1", 5000), 3000);
//			client.connect(new InetSocketAddress("10.10.51.16", 5000), 5000); // 안광현
			System.out.println("서버와의 연결 성공");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			out = new PrintWriter(client.getOutputStream());
//			out = new PrintWriter(client.getOutputStream(), true); // flush 하는 대신 true를 추가해도 된다.
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scanner in = new Scanner(System.in);
		String msg;
		System.out.print("보낼 메시지가 있나요? ");
		while ((msg = in.nextLine()) != null) {
			if (msg.contains("끝")) {
				break;
			}
			out.println(msg);
			out.flush(); // 버퍼를 비워주지 않으면 버퍼가 가득찰 때까지 전송하지 않음
			System.out.print("보낼 메시지가 더 있나요? ");
		}
		
		System.out.println("클라이언트 종료");
		try {
			in.close();
			out.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
