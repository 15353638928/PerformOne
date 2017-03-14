package com.dh.mar.ninth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LinkListTest {//打开或关闭数据库的类
    public static final String url = "";  
    public static final String name = "";  
    public static final String user = "";  
    public static final String password = "";  
  
    public Connection conn = null;  
    public PreparedStatement pst = null;  
  
    public LinkListTest(String sql) {  
        try {  
            Class.forName(name);//指定连接类型  
            conn = DriverManager.getConnection(url, user, password);//获取连接  
            pst = conn.prepareStatement(sql);//准备执行语句  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
  
    public void close() {  
        try {  
            this.conn.close();  
            this.pst.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }  
}