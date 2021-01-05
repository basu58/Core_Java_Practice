package com.basu;

import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		ProblemSolution problemSolution=new ProblemSolution();
		System.out.println(problemSolution.solution(N,K));
	}

}
