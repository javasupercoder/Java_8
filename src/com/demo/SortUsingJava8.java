package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingJava8 {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(12,4,6,12,4,77,89));
		System.out.println("In ascending order");
		List<Integer> list=
				numbers.
				stream().
				sorted().
				collect(Collectors.toList());
		System.out.println(list);
		System.out.println("In descending order");
		numbers.stream().
		sorted(Collections.reverseOrder()).
		forEach(System.out::println);
		
		
		
	}
}
