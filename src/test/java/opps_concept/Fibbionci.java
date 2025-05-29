package opps_concept;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

import gopal.org.Baseclass;

public class Fibbionci extends Baseclass {
	
	public static void fib() {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Number ");
			int num1 = input.nextInt();
		
		int first = 0, second= 1;
		System.out.print("Fibonacci Series: " + first + " " + second);

		for (int j = 3; j <=num1; j++) {
			int next = first+second;//Swaping 0+1=1 then 1+1 =2 so next 2
			System.out.print(" " + next);
			first=second; //1  1  2 3
			second=next;//  1 2    3 5
		
		}
	}
	public static void main(String[] args) {
		fib();
//		firefox();
	}

}
