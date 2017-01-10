package com.dh.may.fourth;
/**
 * 一个场景访问统一资源
 * 生产和消费者模式
 * @author admin-DH
 *
 */
public class TestT {
	public static void main(String[] args) {
		System.out.println("开始");
		Movie movie = new Movie();
		Player  player = new Player(movie);
		Watcher watcher = new Watcher(movie);
		new Thread(watcher).start();
		new Thread(player).start();
		
		
	}

}
