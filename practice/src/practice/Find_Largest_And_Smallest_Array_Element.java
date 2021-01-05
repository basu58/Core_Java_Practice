package practice;

public class Find_Largest_And_Smallest_Array_Element {

	public static void main(String[] args) {
		int[] a= {-25, 1, 0, -98, 98, 256};
		int temp=0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Largest Number is: "+a[a.length-1]);
		System.out.println("Smallest Number is: "+a[0]);
	}

}
