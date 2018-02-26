package com.creational.prototype;

import java.util.List;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the employee object
		Employees empnew = (Employees)emps.clone();
		List<String> list = empnew.getEmpList();
		list.add("Jhon");

		Employees empnew1 = (Employees) emps.clone();
		List<String> list1 = empnew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("Emps list::"+emps.getEmpList());
		System.out.println("Emps list1::"+list);
		System.out.println("Emps list2::"+list1);
	}

}
