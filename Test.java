package ConcatinationOfString;

import java.util.Scanner;

public class Test {
		public static void main(String[] args)
		{
			String fname;
			String lname;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your first name");
			fname = sc.next();
			System.out.println("Enter Your last name");
			lname = sc.next();
			String str = fname + lname;
			System.out.println("Hello "+fname+" "+lname);

		}

}
