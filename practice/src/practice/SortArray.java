package practice;

public class SortArray {

	public static void main(String[] args) {
		int b[] ={-2, 5, 6, 2, 36};
		int temp=0;
		for(int i=0; i<b.length; i++) {
			for(int j=i+1; j<b.length; j++) {
				if(b[j]<=b[i]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println(b.length);
		System.out.println();
		for(int i=0; i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
