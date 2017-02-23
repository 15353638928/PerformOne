package com.dh.feb.callback;

import java.awt.GradientPaint;
import java.awt.Graphics;

import com.dh.feb.before.Point;

public class PaintFrame {
	public static void drawFrame(MyFrame f){
		System.out.println("启动线程");
		System.out.println("查看消息");
		//画窗口
		f.paint(null);
		System.out.println("启动缓存");
	}
	public static void main(String[] args) {
		drawFrame(new SonFrame());
		drawFrame(new MyFrame());
	}
}
class SonFrame extends MyFrame{
	@Override
	public void paint(Graphics f) {
		// TODO Auto-generated method stub
		System.out.println("new ways");
	}
}
