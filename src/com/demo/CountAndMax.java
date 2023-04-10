package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountAndMax {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(12,4,6,12,4,77,89));
		
		long count=numbers.stream().count();
		
		System.out.println("Count of numbers:"+count);
		
		int max=numbers.stream().max(Integer::compare).get();
		
		System.out.println("Max number = "+max);
	}
}
