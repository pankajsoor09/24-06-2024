package com.javaDataTypes;

import com.javaKeywords.Example1;

public class Example2 extends Example1
{
	public int getData1()
	{
		//This method must return a result of type String
		return Example1.age;
	}
	
	public static String getData2()
	{
		//This method must return a result of type String
		return null;
	}
	
	public static void main(String[] args)
	{
		
		Example2 example2 = new Example2();//object
		example2.getData1();
		
		
		Example2.getData2();
		
	}

}
