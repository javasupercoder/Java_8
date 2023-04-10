package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNoUsingJava8 {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>(Arrays.asList(12,34,67,2,3,7));
		System.out.println("Nos are:"+numbers);
		System.out.println("prime nos are:");
		
		List<Integer> list=
				numbers.
				stream().
				filter(a->isPrime(a)).
				collect(Collectors.toList());
		System.out.println(list);
	}
	public static boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				return false;
			}
		}		
		return true;
	}

}
