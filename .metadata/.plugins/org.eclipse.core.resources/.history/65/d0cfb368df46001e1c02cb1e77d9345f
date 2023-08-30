package com.network;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {
	public static void main(String[] args) {
		try (Socket client = new Socket("localhost", 5000);
				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);) {
			oos.writeObject("안녕, 서버!");
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
