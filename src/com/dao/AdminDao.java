package com.dao;

import java.util.List;
import com.pojo.Administrator;

public interface AdminDao {
	public List<Administrator> select();
	public Administrator getone(String name);
	public int add(Administrator admin);
	public int update(Administrator admin);
	public int delete(String name);
	public Administrator one(Integer uno);
}
