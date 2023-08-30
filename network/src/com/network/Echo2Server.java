package com.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Echo2Server extends Thread {
	protected static boolean cont = true;
	protected Socket connection = null;

	private Echo2Server(Socket accept) {
		connection = accept;
		start();
	}

	public void run() {
		BufferedReader in;

		System.out.println("쓰레드 생성됨");

		try {
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String msg;
			while ((msg = in.readLine()) != null) {
				System.out.println("읽은 메시지: " + msg);
			}
			in.close();
			connection.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ServerSocket server = null;

		try {
			server = new ServerSocket(5000);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("서버 소켓 생성 중 ......");

		while (cont) {
			System.out.println("연결 대기중 ......");
			try {
				new Echo2Server(server.accept());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
