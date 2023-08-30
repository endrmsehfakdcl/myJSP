package com.network;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAddressTest {

	public static void main(String[] args) {
		InetAddress addr1 = null;
		InetAddress addr2 = null;
		System.out.print("호스트 이름을 입력하세요 : ");
		Scanner in = new Scanner(System.in);
		String url = in.nextLine();

		try {
			addr1 = InetAddress.getByName(url);
			addr2 = InetAddress.getLocalHost();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(url + "의 IP 주소: " + addr1);
		System.out.println(addr1.getHostAddress());
		System.out.println("로컬 IP 주소: " + addr2.getHostAddress());
	}

}

/*호스트 이름을 입력하세요 : www.keduit.com
www.keduit.com의 IP 주소: www.keduit.com/211.47.74.27
211.47.74.27
로컬 IP 주소: 10.10.55.21
*/