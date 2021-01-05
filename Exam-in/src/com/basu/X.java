package com.basu;
import java.util.*;

public class X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int N, M, i, j, result=-1;
		M = scanner.nextInt();	
		N = scanner.nextInt();
		int A[][] = new int[M][N];
		for(i = 0; i < M; i++) {
			for(j = 0; j < N; j++) {
				A[i][j] = scanner.nextInt();
			}
		}
		int C[] = new int[M];
		for(i = 0; i < M; i++) {
			C[i] = scanner.nextInt();
		}
		ProblemSolution1 problemSolution1 = new ProblemSolution1();		
		result = problemSolution1.solution(M, N, A, C);		
		System.out.println(result);
    }
}