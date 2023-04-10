package com.singleton.demo;

public class Singleton {
	private static Singleton object=null;
	String str="Demo";
	private Singleton() {
		
	}
	static Singleton getInstance() {
		if(object==null) {
			object=new Singleton();
		}
		return object;
	}
}
