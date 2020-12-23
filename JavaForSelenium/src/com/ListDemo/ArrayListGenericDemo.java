package com.ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenericDemo {

	public static void main(String[] args) {
		
		//With generics Type is limited but size is not a concern. Generics help reducing performance and storage issues
		ArrayList<String> obj1 = new ArrayList<String>();
		obj1.add("Gaurav");
		obj1.add("Selenium");
		System.out.println(obj1);
		
		for(String val:obj1){
			System.out.println(val);
		}
		
		//You can use parent of array list to get its methods
		//Example1-
		List<String> obj2 = new ArrayList<String>();
		obj2.add("test1223");
	}

}
