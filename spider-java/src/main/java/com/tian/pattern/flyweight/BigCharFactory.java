package com.tian.pattern.flyweight;

import java.util.HashMap;
public class BigCharFactory{

	
	private HashMap pool = new HashMap();
	
	private static BigCharFactory factory = new BigCharFactory();
	
	private BigCharFactory(){}
	
	public static BigCharFactory getInstance(){
		return factory;
	}
	
	public synchronized BigChar getBigChar(char charname){
		BigChar bc = (BigChar)pool.get("" + charname);
		if (bc == null) {
			bc = new BigChar(charname);
			pool.put("" + charname,bc);
		}
		return bc;
	}
}