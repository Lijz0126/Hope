package com.test;

import java.util.List;

import com.dao.AdminDao;
import com.dao.AdminImpl;
import com.pojo.Administrator;




public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hopedao dao = new HopeImpl();
		List<Hopesoft> lists =dao.select();
		
		
		for (Hopesoft hope : lists) {
			System.out.println(hope);
		}*/
		
		AdminDao dao = new AdminImpl();
		List<Administrator> list = dao.select();
		for (Administrator admin : list) {
			System.out.println(admin);
		}
		Administrator a = new Administrator();		
		a.setName("abc");
		
		System.out.println(a);
	}

}
