package com.basu.hackerrank;

import java.util.Scanner;

public class StringIntro2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(s.substring(x, y));
	}

}
