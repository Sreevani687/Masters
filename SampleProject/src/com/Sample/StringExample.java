package com.Sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class StringExample {
	public static void main(String args[]) {
	 String s1="vani";
	 String s2="vani";
	String s3=new String("vani");
	String s4=new String("vani");
	
	System.out.println(s1==s2);//true 
	System.out.println(s1.equals(s2));//true
	
	System.out.println(s3==s4);//false
	System.out.println(s3.equals(s4));//true
	
	System.out.println(s1==s3);//false
	System.out.println(s1.equals(s3));//true
	
	s1=s1+("1");//vanisree
	s1.concat("3");
	System.out.println(s1);
	//var list=new Link<String>();
	}

}
