package practice;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		
		
		
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt(); 
		}
//		System.out.print("[");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+","); 
		}
		System.out.println();
		//System.out.println("]");
		Test234 t=new Test234();
		System.out.println(t.div(a, n));
	}

}
/*
 * class Test234{ public int div(int[] a, int n) {
 * 
 * int[] x=new int[(n+1)/2]; int[] y=new int[n-x.length];
 * 
 * int sum1=0; int len=x.length; for(int i=0; i<len; i++) { x[i]=a[i];
 * System.out.println(x[i]); sum1=sum1+x[i]; } System.out.println(
 * "------------------------------------------------------------------------");
 * System.out.println(
 * "------------------------------------------------------------------------");
 * int sum2=0; for(int i=0; i<y.length; i++) { y[i]=a[len];
 * System.out.println(y[i]); len++; sum2=sum2+y[i]; } if(sum1==sum2) return 1;
 * else return 0; } }
 */

class Test234{
	public int div(int[] a, int n) {
		int[] x=new int[(n+1)/2]; 
		int[] y=new int[n-x.length];
		int len=x.length;
		int len2=y.length;
		System.arraycopy(a, 0, x, 0, len);
		System.arraycopy(a, len, y, 0, len2);
		
		int sum1=0;
		for(int i=0; i<len; i++) { 
			System.out.println(x[i]); sum1=sum1+x[i]; 
		} 
		System.out.println("------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------");
		int sum2=0; 
		for(int i=0; i<y.length; i++) { 
			System.out.println(y[i]); 
			len++; sum2=sum2+y[i]; 
		} 
		if(sum1==sum2) return 1;
		else return 0;
	}
}