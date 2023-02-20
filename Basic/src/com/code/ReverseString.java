package com.code;

public class ReverseString {
	public static void main(String[] args) {
		
		
		String name="Ompra kash";
		char [] nameChar=name.toCharArray();
		
		StringBuffer sb= new StringBuffer();
		
		StringBuffer s=sb.append(name).reverse();
		
		System.out.println(s.toString());
		
		for(int i=nameChar.length-1;i>=0;i--) {
			sb.append(nameChar[i]);
			
			
		}
		
		//System.out.println(sb.toString());
	}

}
