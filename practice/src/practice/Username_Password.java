package practice;

import java.util.Scanner;

public class Username_Password{
	public static final int PASSWORD_LENGTH = 8;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Are you fresher(Y/N):");
		String ch=sc.next();
		
		System.out.println("Enter your department:");
		sc.next();
		String dept=sc.nextLine();
		
		System.out.print(
				"1. A password must have at least eight characters.\n" +
						"2. A password consists of only letters and digits.\n" +
						"3. A password must contain at least two digits \n" +
				"Input a password (You are agreeing to the above Terms and Conditions.): ");
		String s = sc.nextLine();

		if (is_Valid_Password(s)) {
			System.out.println("Password is valid: " + s);
		} else {
			System.out.println("Not a valid password: " + s);
		}
		System.out.println("Re-typr your password:");
		String s1 = sc.nextLine();

	}

	public static boolean is_Valid_Password(String password) {

		if (password.length() < PASSWORD_LENGTH) return false;

		int charCount = 0;
		int numCount = 0;
		for (int i = 0; i < password.length(); i++) {

			char ch = password.charAt(i);

			if (is_Numeric(ch)) numCount++;
			else if (is_Letter(ch)) charCount++;
			else return false;
		}


		return (charCount >= 2 && numCount >= 2);
	}

	public static boolean is_Letter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');
	}


	public static boolean is_Numeric(char ch) {

		return (ch >= '0' && ch <= '9');
	}

}
