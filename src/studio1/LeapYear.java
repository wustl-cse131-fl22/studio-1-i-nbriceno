package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean divisible = false;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Year ");
		int year1 = in.nextInt();
		
		divisible = (year1 % 4 == 0) && (year1 % 100 != 0)|| (year1 % 400 == 0) ;
		
		System.out.println (divisible);
		
	}

}
