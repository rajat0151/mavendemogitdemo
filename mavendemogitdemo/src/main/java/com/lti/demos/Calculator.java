package com.lti.demos;

public class Calculator {

	public String sayHello(){
		return "Hello world";
	}
	public int addNos(int x,int y) {
		int result=x+y;
		return result;
	}
	public int subNos(int z,int y) {
		int result=z-y;
		return result;
	}
	public void searchEmp(int empId) {
		if(empId==0) {
			throw new ArithmeticException("hello");
		}
		else {
			System.out.println("do something");
		}
	}
}
