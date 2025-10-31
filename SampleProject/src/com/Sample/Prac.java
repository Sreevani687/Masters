package com.Sample;

import java.util.Arrays;
import java.util.List;

public class Prac {

	public static void main(String[] args) {
		char[] ch = { 'c', 'f', 'g', 'n', 't' };
		char target = 'h';
		Character[] chr = { 'c', 'f', 'g', 'n', 't' };
		char result = Arrays.asList(chr).stream().filter(c -> Character.compare(c, target) > 0).findFirst().get().charValue();

//		for (int i = 0;i<ch.length; i++) {
//			if (ch[i] > target) {
//				result = ch[i];
//				break;
//			}
//
//		}
//		// TODO Auto-generated method stub
		
			System.out.println(result);
		
	}

}
