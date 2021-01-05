package com.quickride.test;

import java.util.Scanner;

public class Pyramid {
	public static void display(int x) {
		int i=0, j=0, k=0, n=x;
		for(i=0; i<n; i++) {
			k=1;
			for(j=0; j<(n+i); j++) {
				if(j<(n-i-1))
					System.out.print("");
				else {
					System.out.print(""+k);
					if(j<(n-1))
						k++;
					else
						k--;
				}
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		display(x);
		sc.close();
	}

}
