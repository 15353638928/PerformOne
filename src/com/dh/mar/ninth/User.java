package com.dh.mar.ninth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class User {
private Integer userId;
private String userName;
private String address;
public User(int userId, String userName, String address) {
   this.userId = userId;
   this.userName = userName;
   this.address = address;
}

public String getAddress() {
   return address;
}

public void setAddress(String address) {
   this.address = address;
}

public Integer getUserId() {
   return userId;
}

public void setUserId(Integer userId) {
   this.userId = userId;
}

public String getUserName() {
   return userName;
}

public void setUserName(String userName) {
   this.userName = userName;
}
/*List��Map��Set
List ͨ���±�����ȡ ��ֵ����ȡ
Map ��ֵ��Ӧ����ȡ 
set ��ȡԪ���������*/
public static void main(String[] args) {
//   Map<Integer, User> map = new TreeMap<Integer, User>();
//   map.put(1, new User(1,"��ΰ","beijing"));
//   map.put(2, new User(2,"���ľ�","beijing"));
//  
//   map.put(4, new User(2,"abc","beijing"));
//   map.put(5, new User(2,"abc","beijing"));
//  
//  
//  
//   Set<Integer> keys = map.keySet();
//  
////   Iterator<Integer> it = keys.iterator();
////   while (it.hasNext()) {
////    Integer key = it.next();
////    User user = map.get(key);
////    System.out.println("key = " + key + "\t" + "value = " + user.getUserName());
////   }
//  
//   for (Integer key : keys) {
//    User user1 = map.get(key);
//    System.out.println("key = " + key + "\t" + "value = " + user1.getUserName());
//   }
 
  
   Set<String> set = new HashSet<String>();
   set.add("a");
   set.add("b");
   set.add("c");
   set.add("d");
   set.add("d");
   set.add("d");
   set.add("d");
   set.add("uuu");
   set.add("e");
  
  
   Iterator<String> it = set.iterator();
   while (it.hasNext()) {
    System.out.println(it.next());
   }
  
}
}
