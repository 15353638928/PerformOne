package com.hy.march.Fourteenth;

import java.util.ArrayList;
import java.util.List;

import com.hy.march.Fourteen.Student;

public class ClassR {
	private String no;
	private List<Student> list;
	private double total;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public ClassR() {
		list = new ArrayList<Student>();
	}
	public ClassR(String no) {
		this();
		this.no=no;
	}
	public ClassR(String no, List<Student> list, double total) {
		super();
		this.no = no;
		this.list = list;
		this.total = total;
	}
	

}

package com.hy.march.Fourteenth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hy.march.Fourteen.ClassRoom;
import com.hy.march.Fourteen.Student;

public class CountAverage {
	public static void main(String[] args) {
		List<Student> aList = TestR();
		Map<String, ClassR> mapl = Cout(aList);
		
		Vluaes(mapl);
	}
	public static void Vluaes(Map<String, ClassR> map){
		Set<String> seth = map.keySet();
		Iterator<String> iterator = seth.iterator();
		while(iterator.hasNext()){
			String no = iterator.next();
			ClassR aClassR = map.get(no);
			double totally = aClassR.getTotal();
			double CountAverage = totally/aClassR.getList().size();
			System.out.println("class-->"+no+"-->total-->"+totally+"-->averger-->"+CountAverage);
		}
		
	}
	public static Map<String, ClassR> Cout(List<Student> list){
		Map<String, ClassR> map = new HashMap<String, ClassR>();
		Iterator<Student> iterator = list.iterator();
		
		while(iterator.hasNext()){
			Student stu = iterator.next();
			String no = stu.getNum();
			double score = stu.getScore();
			ClassR room = map.get(no);
			if(null==room){
				room = new ClassR(no);
				map.put(no, room);
			}
			room.getList().add(stu);
			room.setTotal(room.getTotal()+score);
		}
		return map;
	}
	public static List<Student> TestR(){
		List<Student> stulist = new ArrayList<Student>();
		stulist.add(new Student("张三", "一班", 82));
		stulist.add(new Student("李四", "一班", 73));
		stulist.add(new Student("刘能", "一班", 96));
		stulist.add(new Student("赵四", "二班", 88));
		stulist.add(new Student("王五", "二班", 86));
		return stulist;
	}
}

package com.hy.march.Fourteenth;

public class Student {
	private String name;
	private String num;
	private double score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Student() {

	}
	public Student(String name, String num, double score) {
		super();
		this.name = name;
		this.num = num;
		this.score = score;
	}
	
	
}
<---------------------------------------------------->
package com.march;

public class ClassRoom {
	private Student stulist;
	private double total;
	private String no;
	public ClassRoom() {
		
	}
	public ClassRoom(String no) {
		super();
		this.no = no;
	}
	public ClassRoom(Student stulist, double total, String no) {
		super();
		this.stulist = stulist;
		this.total = total;
		this.no = no;
	}
	public Student getStulist() {
		return stulist;
	}
	public void setStulist(Student stulist) {
		this.stulist = stulist;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
}


package com.march;

public class Student {
	private String name;
	private String no;
	private double score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no; 
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Student(String name, String no, double score) {
		super();
		this.name = name;
		this.no = no;
		this.score = score;
	}
	
}


package com.march;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hy.march.Fourteen.Student;
import com.hy.march.Fourteenth.ClassR;

public class TestT {
	public static void main(String[] args) {
		List<Student> list = exam();
		Map<String, ClassRoom> maps = addtest(list);
		cout(maps);
	}
	public static void cout(Map<String, ClassRoom> map){
		Map<String, ClassRoom> maps = new HashMap<String, ClassRoom>();
		Set<String> setlist = maps.keySet();
		Iterator<String> iterator = setlist.iterator();
		while(iterator.hasNext()){
			String no = iterator.next();
			double CoutT = maps.get(no).getTotal();
			double average = CoutT/setlist.size();
			System.out.println("no-->"+no+"---average-->"+average);
		}	
	}
	public static Map<String, ClassRoom> addtest(List<Student> list){
		Map<String, ClassRoom> maps = new HashMap<String, ClassRoom>();
		List<Student> slist = new ArrayList<Student>();
		Iterator<Student> iterator = slist.iterator();
		while(iterator.hasNext()){
			Student stu = iterator.next();
			String no = stu.getNo();
			double score = stu.getScore();
			ClassRoom classRoom = maps.get(no);
			if(null == maps.get(no)){
				classRoom = new ClassRoom(no);
				maps.put(no, classRoom);
			}else{
				maps.put(no, classRoom);
			}
			classRoom.setTotal(score+classRoom.getTotal());
		}
		return maps;
		
//		Map<String, ClassR> map = new HashMap<String, ClassR>();
//		Iterator<Student> iterator = list.iterator();
//		
//		while(iterator.hasNext()){
//			Student stu = iterator.next();
//			String no = stu.getNum();
//			double score = stu.getScore();
//			ClassR room = map.get(no);
//			if(null==room){
//				room = new ClassR(no);
//				map.put(no, room);
//			}
//			room.getList().add(stu);
//			room.setTotal(room.getTotal()+score);
//		}
//		return map;
	}
	
	public static List<Student> exam(){
		List<Student> slist = new ArrayList<Student>();
		if(null == slist){
			slist.add(new Student("1", "大班", 80));
			slist.add(new Student("2", "大班", 80));
			slist.add(new Student("3", "大班", 80));
			slist.add(new Student("4", "大班", 80));
			slist.add(new Student("11", "小班", 70));
			slist.add(new Student("22", "小班", 70));
		}
		return slist;
	}
}
