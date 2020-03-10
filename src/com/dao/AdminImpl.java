package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Administrator;
import com.util.Return;
import com.util.Util;

public class AdminImpl implements AdminDao {

	@Override
	public Administrator getone(String name) {
		// TODO Auto-generated method stub
		return Util.selectOne("select password,sex,age,hobby from administrator where name=?",
				new Return<Administrator>() {

					@Override
					public Administrator returning(ResultSet rs) {
						// TODO Auto-generated method stub
						Administrator admin = new Administrator();
						try {
							admin.setPassword(rs.getString("password"));
							admin.setSex(rs.getString("sex"));
							admin.setAge(rs.getInt("age"));
							List<String> hobby = new ArrayList<String>();
							String str = rs.getString("hobby");
							
							String[] s = str.split(",");
							
							for(int i=0;i<s.length;i++) {
								hobby.add(s[i]);
							}
							admin.setName(name);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return admin;
					}
				}, name);
	}

	@Override
	public Administrator one(Integer uno) {
		// TODO Auto-generated method stub
		return Util.selectOne("select uno,name,password,sex,age,hobby from administrator where uno=?",
				new Return<Administrator>() {

					@Override
					public Administrator returning(ResultSet rs) {
						// TODO Auto-generated method stub
						Administrator admin = new Administrator();
						try {
							admin.setName(rs.getString("name"));
							admin.setPassword(rs.getString("password"));
							admin.setSex(rs.getString("sex"));
							admin.setAge(rs.getInt("age"));
							admin.setHobby(rs.getString("hobby"));
							admin.setUno(uno);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return admin;
					}
				}, uno);
	}
	
	@Override
	public List<Administrator> select() {
		// TODO Auto-generated method stub
		return Util.select("select uno,name,sex,age,hobby from administrator", new Return<Administrator>() {

			@Override
			public Administrator returning(ResultSet rs) {
				// TODO Auto-generated method stub
				Administrator admin = new Administrator();
				try {
					admin.setUno(rs.getInt("uno"));
					admin.setName(rs.getString("name"));
					admin.setSex(rs.getString("sex"));
					admin.setAge(rs.getInt("age"));
					admin.setHobby(rs.getString("hobby"));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return admin;
			}
		}, null);
	}

	@Override
	public int add(Administrator admin) {
		// TODO Auto-generated method stub
		return Util.event("insert into administrator(name,password,sex,age,hobby ) values(?,?,?,?,?)", admin.getName(),
				admin.getPassword(), admin.getSex(), admin.getAge(), admin.getHobby());
	}

	@Override
	public int update(Administrator admin) {
		// TODO Auto-generated method stub
		return Util.event("update administrator set name=?,password=?,sex=?,age=?,hobby=? where uno=? ",
				admin.getName(), admin.getPassword(), admin.getSex(), admin.getAge(), admin.getHobby(),
				admin.getUno());
	}

	@Override
	public int delete(String name) {
		// TODO Auto-generated method stub
		return Util.event("delete from administrator where name=?", name);
	}




}
