package com.example.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonDataModel {
	private Map<String, Object> data;
	
	public CommonDataModel() {
		data = new HashMap<String, Object>();
	}
	
	public Object get(String key) {
		return data.get(key);
	}
	
	public String getString(String key) {
		return data.get(key).toString();
	}
	
	public void put(String key, Object value) {
		data.put(key, value);
	}
	
	public void printData() {
		System.out.println("===============================");
		System.out.print("CommonDataModel");
		for(String s: data.keySet()) {
			System.out.println(s+" "+data.get(s).toString());
		}
		System.out.println("===============================");
	}
	
	public Set<String> getKeySet(){
		return data.keySet();
	}
}
