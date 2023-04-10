package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(12,4,6,12,4,77,89));
		Set<Integer> set=new HashSet();
		System.out.println("Duplicate numbers are:");
		numbers.
		stream().filter(a->!set.add(a)).forEach(System.out::println);
		
	}
}
