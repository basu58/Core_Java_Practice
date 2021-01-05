package practice;

public class MergeAndSortArray {
	public static void main(String[] args) {
		
		int a[] = {-1, 2, 8,9,100}, b[] = {-2, 5, 6, 2, 36};
		int x=a.length;
		int y=b.length;
		int length=x+y;
		int[] c=new int[length];
		int temp=0;
		for(int i=0; i<b.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<=a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		int temp1=0;
		for(int i=0; i<b.length; i++) {
			for(int j=i+1; j<b.length; j++) {
				if(b[j]<=b[i]) {
					temp1=b[i];
					b[i]=b[j];
					b[j]=temp1;
				}
			}
		}
		System.out.println();
		for(int i=0; i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		int i=0, j=0,k=0;
		 while (i < x && j < y) {
	         if (a[i] < b[j])
	            c[k++] = a[i++];
	         else
	            c[k++] = b[j++];
	      }
	      while (i < x)
	         c[k++] = a[i++];
	      while (j < y)
	         c[k++] = b[j++];
		System.out.println();
		for(int p=0; p<c.length;p++) {
			System.out.print(c[p]+" ");
		}
		
		
	}

}
