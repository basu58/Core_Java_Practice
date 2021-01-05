package practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int x=372;
		int temp=0, count=0,result=0;
		int num=x;
		while(num!=0) {
			num/=10;
			count++;
		}
		num=x;
		while(num!=0) {
			temp=num%10;
			result=(int) (result+Math.pow(temp, count));
			num/=10;
		}
		if(result==x) {
			System.out.println(true);
		}
		else
			System.out.println(false);
	}

}
