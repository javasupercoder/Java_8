package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> al=new LinkedList(Arrays.asList(1,5,8,12,90,11,45));
		System.out.println(al);
		
		List<Integer> al1= al.stream().
				filter(i -> i%2==0).collect(Collectors.toList());
		
		al1.forEach(i->System.out.println(i));
	}

}
