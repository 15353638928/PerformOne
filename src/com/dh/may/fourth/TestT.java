package com.dh.may.fourth;
/**
 * һ����������ͳһ��Դ
 * ������������ģʽ
 * @author admin-DH
 *
 */
public class TestT {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		Movie movie = new Movie();
		Player  player = new Player(movie);
		Watcher watcher = new Watcher(movie);
		new Thread(watcher).start();
		new Thread(player).start();
		
		
	}

}
