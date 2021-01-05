package com.quickride.test;

import java.util.Scanner;

public class AllSubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str=str.replaceAll("\\s","");
		sc.close();
		AllSubString sub = new AllSubString();
		String[] x = sub.addSubStrings(str);
		for (String substr : x) {
			System.out.println(substr);
		}
	}
	private String[] addSubStrings(String str) {
		int size = str.length();
		int total = size * (size + 1) / 2;
		String x[] = new String[total];
		int count = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i; j++) {
				String str1 = str.substring(i, size - j);
				x[count] = str1;
				count++;
			}
		}
		return x;
	}
}
