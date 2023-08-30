package com.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Echo1Server {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket connection = null;
		BufferedReader in = null;

		try {
			server = new ServerSocket(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("연결 대기중 ...");

		try {
			connection = server.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메시지를 기다리는 중 ...");

		try {
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String msg;
			while ((msg = in.readLine()) != null) {
				if (msg.contains("끝")) {
					break;
				}
				System.out.println("읽은 메시지: " + msg);
			}

			System.out.println("서버 종료");
			in.close();
			connection.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
