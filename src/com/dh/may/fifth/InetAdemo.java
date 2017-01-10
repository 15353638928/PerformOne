package com.dh.may.fifth;

/**
 * @author admin-DH
 */
 
 
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress aaa = InetAddress.getLocalHost();
		System.out.println(aaa.getHostAddress());
		System.out.println(aaa.getHostName());
		
		aaa = InetAddress.getByName("10.101.121.12");
		System.out.println(aaa.getHostAddress());
		System.out.println(aaa.getHostName());
		
	}
}
