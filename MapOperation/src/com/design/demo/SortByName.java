package com.design.demo;

import java.util.Comparator;
import java.util.Map;

public class SortByName implements Comparator<Map.Entry<Integer, Employee>>{
	public int compare(Map.Entry<Integer, Employee> a,Map.Entry<Integer, Employee> b){
		return (a.getValue().getName().compareTo(b.getValue().getName()));
	}
}
