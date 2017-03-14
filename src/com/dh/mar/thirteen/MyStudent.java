package com.dh.mar.thirteen;

import com.dh.feb.before.Student;

/**定义:泛型擦除是指在继承(实现)或使用时没有指定具体的类型
 * 
 */
public class MyStudent {
	public static void main(String[] args) {
		//擦除-->没有指定  泛型的具体类型
		StuApp app = new StuApp();	
		app.setName(100);//100-->int -->integer
		Object object = app.getName();
		test(app);//编译不会类型检查
		/**
		 * 类似于Object，不等于boject
		StuApp<Object> app2 = new StuApp<Object>();
		test(app2);    
		 */
	}

	public  static void test(StuApp<Integer> stu){
		
	}
}
