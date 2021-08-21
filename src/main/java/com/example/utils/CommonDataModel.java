package com.example.utils;

import java.util.HashMap;
import java.util.Map;

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
	
}
