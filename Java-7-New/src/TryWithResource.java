import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			int i=sc.nextInt();
			System.out.println(i);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
