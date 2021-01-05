package com.basu.practice;

import java.util.ArrayList;

public class Words {
	public static void solution(String s) {
		//ArrayList<String> list=new ArrayList<>();
		String[] arr=s.split(" ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println(reverse(arr[i])+" ");
		}
		
	}
	public static String reverse(String s) {
		String s1="";
		for(int i=(s.length()-1); i>=0; i--) {
			s1=s1+s.charAt(i);
		}
		return s1;
	}
	public static void main(String[] args) {
		
		solution("Java programming");
	}

}
