package com.blogspot.javainspires;

import java.util.ArrayList;
import java.util.List;

public class SortArrayListWithLambda {

	public static void main(String[] args) {

		// let create a string type array list and populate some values
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Water Melon");
		fruits.add("Dragon");

		//print list before sorting
		System.out.println(fruits);
		// lets sort this array using java 8 lambda

		fruits.sort((f1, f2) -> f1.compareToIgnoreCase(f2));
		// print list after sorting
		System.out.println(fruits);
	}
}
