package com.dh.may.fifth;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class InsocketDemo {
	public static void main(String[] args) {
		InetSocketAddress  aInetSocketAddress = new InetSocketAddress("www.baidu.com", 8080);
		System.out.println(aInetSocketAddress.getAddress());
		System.out.println(aInetSocketAddress.getHostName());
		System.out.println(aInetSocketAddress.getPort());
		
		InetAddress pp = aInetSocketAddress.getAddress();
		System.out.println(pp.getHostAddress());
		System.out.println(pp.getHostName());
	}
}
