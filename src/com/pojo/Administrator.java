package com.pojo;

import java.lang.reflect.Array;
import java.util.List;

public class Administrator {
		private String name;
		private String password;
		private Integer age;
		private String sex;
		private String hobby;
		private Integer uno;
		
		
		public Integer getUno() {
			return uno;
		}
		public void setUno(Integer uno) {
			this.uno = uno;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getHobby() {
			return hobby;
		}
		public void setHobby(String hobby) {
			this.hobby = hobby;
		}
		
		@Override
		public String toString() {
			return "Administrator [name=" + name + ", password=" + password + ", age=" + age + ", sex=" + sex
					+ ", hobby=" + hobby + ", uno=" + uno + "]";
		}
	

		
		
		
}
