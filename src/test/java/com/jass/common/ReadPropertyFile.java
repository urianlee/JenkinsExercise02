package com.jass.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;



public class ReadPropertyFile {
	public  String pValue;
	public  String ConfigPathLocation="./Config.properties";

	
	public  String readFile(String File,String pName) {
		try {
			Properties pro = new Properties();
			FileInputStream in = new FileInputStream(File);
			pro.load(in);
			// getting values from property file
			 pValue = pro.getProperty(pName);
			 System.out.println("Value is:" + pValue );
			 return pValue;
		
		} catch (IOException e) {
			System.out.println("Error is:" + e.getMessage());
			e.printStackTrace();
		}
		return pValue;

	}
	
	 public String getConfigPropertyVal(final String key) {
		    String ConfigPropertyVal = readFile(ConfigPathLocation,key);
			return ConfigPropertyVal != null ? ConfigPropertyVal.trim() : ConfigPropertyVal;
		}
	
}
