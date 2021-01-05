package com.basu;
public class ProblemSolution1{
    public int solution(int M, int N, int[][] A, int[] C){
        int x=0;
	    //write your code here
        int p=0, q=0;  
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    if(C[k]==A[i][j]){
                        ++p;
                        break;
                    }
                    else
                    	++p;
                }
            }
            for(int j=N-1; j>=0; j--){
                for(int k=0; k<M; k++){
	                    if(C[k]==A[0][j]) {
	                        ++q;
	                    	break;
	                    }
	                    else
	                    	++q;
                }
            }
        }
        if(p<q) {
        	x=x+p;
        }
        else
        	x=x+q;
        return x;

	}
}