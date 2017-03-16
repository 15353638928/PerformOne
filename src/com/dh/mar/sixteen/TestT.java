package com.dh.mar.sixteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestT{
	public static void main(String[] args) {
		List<Student> list = exam();
		Map<String, ClassRoom> maps = addtest(list);
		Vluaes(maps);
	}
	public static void Vluaes(Map<String, ClassRoom> map){
		Set<String> setlist = map.keySet();
		Iterator<String> iterator = setlist.iterator();
		while(iterator.hasNext()){
			String no = iterator.next();
			ClassRoom room = map.get(no);
			double CoutT = map.get(no).getTotal();
			double average = CoutT/room.getStulist().size();
			System.out.println("no-->"+no+"---average-->"+average);
//			
		}	
	}
	public static Map<String, ClassRoom> addtest(List<Student> list){
		Map<String, ClassRoom> maps = new HashMap<String, ClassRoom>();
		//List<Student> slist = new ArrayList<Student>();
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()){
			Student stu = iterator.next();
			String no = stu.getNo();
			double score = stu.getScore();
			ClassRoom classRoom = maps.get(no);
			if(null == classRoom){
				//如果班级没有的话,就调用ClassRoom造一个
				classRoom = new ClassRoom(no);
				maps.put(no, classRoom);
			}
			classRoom.getStulist().add(stu);
			classRoom.setTotal(score+classRoom.getTotal());
		}
		return maps;
	}
	public static List<Student> exam(){
		List<Student> slist = new ArrayList<Student>();
		if(slist!=null&&slist.isEmpty()){
		slist.add(new Student("1", "班级1", 82));
		slist.add(new Student("2", "班级1", 83));
		slist.add(new Student("3", "班级1", 98));
		slist.add(new Student("4", "班级1", 77));
		slist.add(new Student("11", "班级2", 74));
		slist.add(new Student("22", "班级2", 90));
		}
		//		if(null==slist){
		//			slist.add(new Student("1", "班级1", 80));
		//			slist.add(new Student("2", "班级1", 80));
		//			slist.add(new Student("3", "班级1", 80));
		//			slist.add(new Student("4", "班级1", 80));
		//			slist.add(new Student("11", "班级2", 70));
		//			slist.add(new Student("22", "班级2", 70));
		//		}
		//你定义了一个变量如int egotong=0;但是你后面根本就没有使用到这个变量，这一行的前面会有一个黄色的警告标志(@SuppressWarnings("unused")），你将鼠标移动到上面会提示“这个变量从未被使用”，你用上面的标注后就没有这个提示了。
		//就比如说此例子中的slist虽然定义了，但是if语句判断之后，根本就没用slist变量
		return slist;
	}
}