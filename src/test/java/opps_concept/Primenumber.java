package opps_concept;

import java.util.Iterator;
import java.util.Scanner;

public class Primenumber {

	public static boolean isprime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				System.out.println("Square root of the Number " + Math.sqrt(num));
				return false;
			}
			return true;

		}
		return true;

	}

	public static void main(String[] args) {

		for (int i = 0; i <= 3; i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Number ");
			int num = input.nextInt();
			if (isprime(num)) {
				System.out.println("Yes its a prime number");
			} else {
				System.out.println("No its not a prime number");

			}
		}

	}

}
