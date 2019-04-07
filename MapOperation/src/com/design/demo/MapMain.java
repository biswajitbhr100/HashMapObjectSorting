package com.design.demo;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapMain {
	private static HashMap<Integer,Employee> putObj(List<Map.Entry<Integer,Employee>> list){
		HashMap<Integer,Employee> m = new LinkedHashMap<>();
		for(Map.Entry<Integer, Employee> x : list){
			m.put(x.getKey(), x.getValue());
		}
		return m;
	}
	private static void displayMap(HashMap<Integer,Employee> map){
		for(Map.Entry<Integer, Employee> y : map.entrySet()){
			System.out.println("Key-" + y.getKey() + " " + "Value- (" +  
		y.getValue().getId() + " " + y.getValue().getName() + " " + y.getValue().getCity() + ")"); 
		}
	}
	private static void sortMap(Map<Integer,Employee> obj,int mapOpt){
		List<Map.Entry<Integer,Employee>> list = new LinkedList<>(obj.entrySet());
		switch(mapOpt){
		case 1:
			Collections.sort(list,new SortById());
			HashMap<Integer,Employee> sortById = putObj(list);
			displayMap(sortById);
			break;
		case 2:
			Collections.sort(list,new SortByName());
			HashMap<Integer,Employee> sortByName = putObj(list);
			displayMap(sortByName);
			break;
		case 3:
			Collections.sort(list,new SortByCity());
			HashMap<Integer,Employee> sortByCity = putObj(list);
			displayMap(sortByCity);
			break;
		default:
			System.out.println("Invalid Option...!");
			break;
		}
	}
	public static void main(String[] args){
		Map<Integer,Employee> map = new HashMap<>();
		map.put(1, new Employee(10,"biswa","bbsr"));
		map.put(2, new Employee(12,"good","ctc"));
		map.put(3, new Employee(5,"swag","dkl"));
		map.put(4, new Employee(9,"jack","rkl"));
		System.out.println("Enter Sorting Option :(1 for ID, 2 for NAME , 3 for CITY) :");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		sortMap(map,opt);
	}
}
