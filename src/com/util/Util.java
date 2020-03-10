package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class Util {
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn,PreparedStatement pst,ResultSet rs){
		
		try {
			if(rs!=null){
			    rs.close();
			}
			if(pst!=null){
				pst.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	
	public static int event(String sql,Object...obj){
    	int result=0;
    	Connection conn = null;
    	PreparedStatement pst = null;
    	try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8", "root", "123456");
			pst = conn.prepareStatement(sql);
			if(obj!=null){
				for(int i=0;i<obj.length;i++){
					pst.setObject(i+1, obj[i]);
				}
			}
			result = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(conn, pst, null);
		}
    	return result;
    }
	
	public static <T> List<T> select(String sql,Return<T> returnn,Object...obj){
		List<T> select = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8", "root", "123456");
			pst = conn.prepareStatement(sql);
			if(obj!=null){
				for(int i=0;i<obj.length;i++){
					pst.setObject(i+1, obj[i]);
				}
			}
			rs = pst.executeQuery();
			while(rs.next()){
				T t = returnn.returning(rs);
				select.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(conn, pst, rs);
		}
		return select;
		}
	
	
	public static <T> T selectOne(String sql,Return<T> returnn,Object...obj){
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		T t = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8", "root", "123456");
			pst = conn.prepareStatement(sql);
			if(obj!=null){
				for(int i=0;i<obj.length;i++){
					pst.setObject(i+1, obj[i]);
				}
			}
			rs = pst.executeQuery();
			if(rs.next()){
				t = returnn.returning(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(conn, pst, rs);
		}
		return t;
		}
}
