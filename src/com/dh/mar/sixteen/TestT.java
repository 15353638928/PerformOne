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
				//����༶û�еĻ�,�͵���ClassRoom��һ��
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
		slist.add(new Student("1", "�༶1", 82));
		slist.add(new Student("2", "�༶1", 83));
		slist.add(new Student("3", "�༶1", 98));
		slist.add(new Student("4", "�༶1", 77));
		slist.add(new Student("11", "�༶2", 74));
		slist.add(new Student("22", "�༶2", 90));
		}
		//		if(null==slist){
		//			slist.add(new Student("1", "�༶1", 80));
		//			slist.add(new Student("2", "�༶1", 80));
		//			slist.add(new Student("3", "�༶1", 80));
		//			slist.add(new Student("4", "�༶1", 80));
		//			slist.add(new Student("11", "�༶2", 70));
		//			slist.add(new Student("22", "�༶2", 70));
		//		}
		//�㶨����һ��������int egotong=0;��������������û��ʹ�õ������������һ�е�ǰ�����һ����ɫ�ľ����־(@SuppressWarnings("unused")�����㽫����ƶ����������ʾ�����������δ��ʹ�á�����������ı�ע���û�������ʾ�ˡ�
		//�ͱ���˵�������е�slist��Ȼ�����ˣ�����if����ж�֮�󣬸�����û��slist����
		return slist;
	}
}