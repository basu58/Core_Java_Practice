package com.BBI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; 

/**
 * @author Basudev
 *
 */
public class Floating_Point_Number 
{ 
	// Method splits String into 
	// all possible tokens 
	public static void printSolution(String s) 
	{	try {
		String[] d=new String[1000];
		int i=0;
		//Store all all possible token String except "," in an String[] 
		for (String val: s.split(",")) { 
			d[i]=val;
			i++;
		}
		List<String> list = new ArrayList<String>();
		//convert String[] into List and remove null from String[]
		for(String s1 : d) {
			if(s1 != null) {
				list.add(s1);
			}
		}
		//Again Store all values from List to String[]
		d = list.toArray(new String[list.size()]);

		//Convert String[] all elements into double[]
		double[] d1=new double[d.length];
		for(int p=0; p<d1.length; p++) {
			d1[p]=Double.parseDouble(d[p]);
		}

		//Divide double[] into multiple double[] with possible intervals 
		double[] first=new double[d1.length];
		double[] second=new double[d1.length];
		double[] third=new double[d1.length];
		double[] fourth=new double[d1.length];
		double[] fifth=new double[d1.length];
		int a=0, b=0, c=0, d5=0, e=0;
		boolean b1=false, b2=false, b3=false, b4=false, b5=false;

		for(int p=0; p<d1.length; p++) {
			if(d1[p]>=0 && d1[p]<=0.2) {
				first[a]=d1[p];
				a++;
				b1=true;
			}
			else if(d1[p]>=0.2 && d1[p]<=0.4) {
				second[b]=d1[p];
				b++;
				b2=true;
			}
			else if(d1[p]>=0.4 && d1[p]<=0.6) {
				third[c]=d1[p];
				c++;
				b3=true;
			}
			else if(d1[p]>=0.6 && d1[p]<=0.8) {
				fourth[d5]=d1[p];
				d5++;
				b4=true;
			}
			else if(d1[p]>=0.8 && d1[p]<=1) {
				fifth[e]=d1[p];
				e++;
				b5=true;
			}
			else {
				System.out.println("you have entered wrong floating number...");
				System.exit(0);
			}//else
		}//for
		int x=0;
		if(b1==true)
			x++;
		if(b2==true)
			x++;
		if(b3==true)
			x++;
		if(b4==true)
			x++;
		if(b5==true)
			x++;

		//Again convert double[] into List and remove extra 0.0 from double[]
		List<Double> l = new ArrayList<Double>();

		for(double s1 : first) {
			if(s1 != 0.0) {
				l.add(s1);
			}//if
		}//for end
		//convert list<Double> into double[]
		double[] first1=new double[l.size()];
		for(int q=0; q<first1.length; q++) {
			first1[q] = l.get(q); 
		}//for end
		List<Double> list1 = new ArrayList<Double>();

		for(double s1 : second) {
			if(s1 != 0.0) {
				list1.add(s1);
			}
		}//for end
		double[] second1=new double[list1.size()];
		for(int q=0; q<second1.length; q++) {
			second1[q] = list1.get(q); 
		}//for end
		List<Double> list2 = new ArrayList<Double>();

		for(double s1 : third) {
			if(s1 != 0.0) {
				list2.add(s1);
			}
		}//for end
		double[] third1=new double[list2.size()];
		for(int q=0; q<third1.length; q++) {
			third1[q] = list2.get(q); 
		}//for end
		List<Double> list3 = new ArrayList<Double>();

		for(double s1 : fourth) {
			if(s1 != 0.0) {
				list3.add(s1);
			}
		}//for end
		double[] fourth1=new double[list3.size()];
		for(int q=0; q<fourth1.length; q++) {
			fourth1[q] = list3.get(q); 
		}//for end
		List<Double> list4 = new ArrayList<Double>();

		for(double s1 : fifth) {
			if(s1 != 0.0) {
				list4.add(s1);
			}
		}//for end
		double[] fifth1=new double[list4.size()];
		for(int q=0; q<fifth1.length; q++) {
			fifth1[q] = list4.get(q); 
		}//for end
		//evaluate double[] is smaller than 3 or not
		if(first1.length<3 && second1.length<3 && third1.length<3 && fourth1.length<3 && fifth1.length<3) {
			double[] main=new double[x];
			int r=0;
			if(b1) {
				main[r]=solution(first1);
				r++;
			}
			if(b2) {
				main[r]=solution(second1);
				r++;
			}
			if(b3) {
				main[r]=solution(third1);
				r++;
			}
			if(b4) {
				main[r]=solution(fourth1);
				r++;
			}
			if(b5) {
				main[r]=solution(fifth1);
				r++;
			}
			for(int p=0; p<main.length; p++) {
				if(p<=main.length-2)
					System.out.print(main[p]+",");
				else 
					System.out.println(main[p]);
			}//if
		}//if
		//evaluate double[] length is greater than 3 or not
		else if(first1.length>=3 || second1.length>=3 || third1.length>=3 || fourth1.length>=3 || fifth1.length>=3) {
			//evaluate double[] length is equal to 1 
			if(first1.length==1 || second1.length==1 || third1.length==1 || fourth1.length==1 || fifth1.length==1) {
				double[] main=new double[x];
				int r=0;
				if(b1) {
					main[r]=solution(first1);
					r++;
				}
				if(b2) {
					main[r]=solution(second1);
					r++;
				}
				if(b3) {
					main[r]=solution(third1);
					r++;
				}
				if(b4) {
					main[r]=solution(fourth1);
					r++;
				}
				if(b5) {
					main[r]=solution(fifth1);
					r++;
				}
				for(int p=0; p<main.length; p++) {
					if(p<=main.length-2)
						System.out.print(main[p]+",");
					else 
						System.out.println(main[p]);
				}//for
			}//if
			else {
				//calling function with passing arrays
				String str1="";
				if(b1) {
					String s1=solution1(first1);
					str1=str1+s1;
				}
				if(b2) {
					String s2=solution1(second1);
					str1=str1+s2;
				}
				if(b3) {
					String s3=solution1(third1);
					str1=str1+s3;
				}
				if(b4) {
					String s4=solution1(fourth1);
					str1=str1+s4;
				}
				if(b5) {
					String s5=solution1(fifth1);
					str1=str1+s5;
				}
				int q=str1.lastIndexOf(",");
				str1=str1.substring(0, q);
				System.out.println(str1);
				
			}//else
		}//else if
	}
	catch(Exception e) {
		System.out.println("Please enter only floating point numbers between 0 to 1");
	}
	}//printSolution() end
	//called function
	public static double solution(double[] arr) {
		//sorting arrays in ascending order
		Arrays.sort(arr);
		return arr[0];
	}//solution() end
	//called function
	public static String solution1(double[] arr) {
		//sorting arrays in ascending order
		Arrays.sort(arr);
		if(arr.length>=2)
			return ""+arr[0]+","+arr[1]+",";
		else 
			return ""+arr[0]+",";
	}//solution1() end

	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		//Enter values for evaluate
		String str=sc.nextLine();
		//calling solution function
		printSolution(str); 
		sc.close();
	}//main end 
}//class end 

