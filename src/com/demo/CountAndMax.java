package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountAndMax {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(12,4,6,12,4,77,89));
		System.out.println("List elements are : "+numbers);
		long count=numbers.stream().count();
		
		System.out.println("Count of numbers:"+count);
		
		int max=numbers.stream().max(Integer::compare).get();
		  
		System.out.println("Max number = "+max);
		System.out.println("End of code");
		
		System.out.println("End of code from Github website");
		System.out.println("End of code from Github website try 1");
		System.out.println("End of the code 18 oct");
		System.out.println("End of the code 18 oct...");
		System.out.println("How are you.");
		
	}
}
