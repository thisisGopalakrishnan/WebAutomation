package testing_Purpose;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void Reverse_string() {
		String s = "malayalam";
		String rev = "";
		char Target = 'a';
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev += s.charAt(i);

		}
		System.out.println("Reversed String   " + rev);

		if (s.equals(rev)) {
			System.out.println("Yes Its a palindrom");

		} else {
			System.out.println("No, Its not a palindrome");
		}
	}

	public static void duplicates() {

		String str = "gopalakrishnan";
		String s = "";
		int a[] = { 1, 2, 1, 3, 4, 5, 6, 7, 8, 5, 8 };
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> duplicate = new HashSet<Integer>();
		HashSet<Character> charList = new HashSet<Character>();
		HashSet<Character> duplicateList = new HashSet<Character>();

		for (char ch : str.toCharArray()) {
			if (!charList.add(ch)) {
				duplicateList.add(ch);
			}

		}
		System.out.println("Duplicate list  " + duplicateList);

		for (int num : a) {
			if (!set.add(num)) {

				duplicate.add(num);
			}

		}
		System.out.println("dups" + duplicate);
		System.out.println("Duplicate Numbers  " + duplicate);
	}

	public static void prime_number() {

		Scanner Input = new Scanner(System.in);
		System.out.println("enter the number");
		int num1 = Input.nextInt();
		boolean isprime = true; // Assume initially true.

		for (int i = 2; i < num1; i++) {
			System.out.println(i);
			if (num1 % i == 0) {
				isprime = false;
				break;
			}

		}
		if (isprime) {

			System.out.println("its a prime number");
		} else {
			System.out.println("its not  a prime number");
		}
	}

	public static void duplicate() {
		int a[] = { 1, 2, 3, 4, 5, 1, 3 };
		int b[] = { 11, 12, 13, 14, 15, 11, 14 };

		Arrays.sort(b);
		System.out.println("Sorted Array: " + Arrays.toString(b));
//		Adding Two numbers equals to 5
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] + a[j] == 5) {
					System.out.println("Numbers " + a[i] + "  plus" + " " + a[j] + "  Equals to 5");
				}

			}
		}
//		fillter the duplicates by using sort method
		for (int i = 0; i < b.length - 1; i++) {		
			if (b[i] == b[i + 1]) {
				System.out.println("duplicate number  " + b[i]);

			}

		}
// finding the duplicate numbers by using for loop
//		{ 1, 2, 3, 4, 5, 1, 3 };
		for (int i = 0; i < a.length; i++) {
			System.out.println("values of I  " + i);
			for (int j = i + 1; j < a.length - 1; j++) {
				System.out.println("values of J  " + j);
				if (a[i] == a[j + 1]) {
					System.out.println(a[i]);

				}

			}

		}
	}

	public static void main(String[] args) {
		// Reverse_string();
		duplicate();

//		prime_number();

	}
}
