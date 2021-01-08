package com.basu;

public class ProblemSolution {
	public int solution(int N, int K) {
		
		int x;
		return 0;
	}
	public int pallindrome(int N) {
		int rev = 0, rem,actual_num,temp_num;


		actual_num = N;
		temp_num = actual_num;

		while(temp_num > 0){
			// Store remainder
			rem = temp_num % 10;
			// Store number in reverse form
			rev = rev*10+rem;
			// Truncate last digit from number
			temp_num = temp_num/10;
		}

		if(rev == actual_num)
			return 1;
		else
			return 0;
	}
}
