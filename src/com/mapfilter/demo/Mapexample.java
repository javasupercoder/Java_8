package com.mapfilter.demo;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Mapexample {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,34,89,34,98,81,89);
		Set<Integer> s=new LinkedHashSet();
		List<Integer> duplicate=
				list.stream().
				filter(l->!s.add(l)).
				collect(Collectors.toList());
		System.out.println(duplicate);
		//list of strings to upper case
		List<String> names=Arrays.asList("ram","Laxman","Seeta");
		List<String> name=names.stream().
				map(String::toUpperCase).filter(s1->s1.length()>3)
				.collect(Collectors.toList());
		
		
	}

}
