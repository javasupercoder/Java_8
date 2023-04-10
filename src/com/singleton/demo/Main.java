package com.singleton.demo;

public class Main {

	public static void main(String[] args) {
		
		Singleton object1=Singleton.getInstance();
		Singleton object2=Singleton.getInstance();
		Singleton object3=Singleton.getInstance();
		
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());
		System.out.println(object3.hashCode());
		
		object1.str="ABC";
		System.out.println(object1.str);
		System.out.println(object2.str);
		System.out.println(object3.str);
		

	}

}
