package com.abc;

abstract class Person{
	 abstract void sleeping();
	abstract void walking();
}
abstract class Student extends Person{
	void sleeping(){
		System.out.println("This is Rahim");
	}
}
final class CurrentStudent extends Student{
	void walking(){
		System.out.println("This is Robot");
	}
	void talking(){
		System.out.println("jbkjgkjhgk");
	}
}
public class arry {
public static void main(String[] args) {
	Person so=new CurrentStudent();
	so.walking();
}
}
	

