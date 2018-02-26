package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	
	private List<String> empList;

	public Employees() {
		empList = new ArrayList<>();
	}
	
	public Employees(List<String> employees) {
		empList = employees;
	}
	
	public void loadData() {
		//Read all employees from data base and put it into list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}
	
	public List<String> getEmpList(){
		return empList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<>();
		for(String s :  this.getEmpList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}
	
	//Notice that the clone method is overridden to provide a deep copy of the employees list.

}
