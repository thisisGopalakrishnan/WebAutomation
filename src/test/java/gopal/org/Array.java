package gopal.org;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Array {

	public static void single_diamention_() {
		// inputs
		
		int arr[] = { 5,4, 2, 3, 1 };
		int B[] = { 1, 2, 2, 3, 4,,4 5, 5, 6, 7, 7,8 };
		int ip[] = new int[5];
		String[] name = { "gopal", "sheik", "vasanth", "Abisheik" };
		String countofthename = "Gopalakrishana";
		char letter = 'a';
		Scanner input = new Scanner(System.in);
		int num = 2;
		int count = 0;
		int countoftheletter =0;
		int evencount = 0;
		int oddcount = 0;
		int actualnum=0;
		int n = arr.length+1;	
		int target = 5;
		
		
		int min = B[0];
		int max =B[0];
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1 ; j < arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println("number  "+arr[i] +"pair"+arr[j]);
				}	
			}
			
		}
		for (char ch : countofthename.toCharArray()) {
			
		if(ch == letter) {
			
			countoftheletter++;
			System.out.println("the Repaeating letter is   "+letter);
		}
					}
		System.out.println("Number of the letter count  "+countoftheletter);
		
		for (int i = 0; i < B.length; i++) {
			if (B[i]<min) {
				min=B[i];			
			}
			if (B[i]>max) {
				max=B[i];			
			}
		}
		System.out.println("min value and max value" + min);
		System.out.println("min value and max value" + max);
		
	
	//ASCENDING ORDER OF ARRAY	
		for(int i1 = 0; i1<arr.length-1;i1++) {
			for (int j=0; j<arr.length-1-i1;j++)
				if (arr[j]>arr[j+1]) {
			int temp = arr[j];//swaping the two numbers
			arr[j]=arr[j+1];
			arr[j+1]= temp;
				}	
		}
		System.out.println("Ascending order" +" " +java.util.Arrays.toString(arr));

		//find the missing number
		int totalnum = n*(n+1)/2;
		for (int i = 0; i<arr.length; i++) {
			actualnum += arr[i];	//input 4, 2, 3, 1 
		}
	int missingnumber = totalnum-actualnum;
	System.out.println("missing number"+"  "+missingnumber);
	 
	
		// print Even numbers & Odd Numbers & count of the even and odd numbers.
		for (int even : B) {
			if (even % 2 == 0) {
				System.out.println("even numbers" + "   " + even);
				evencount++;
			} else {
				System.out.println("Odd numbers" + "   " + even);
				oddcount++;
			}
		}
		System.out.println("PRINT EVEN NUMBERS" + " " + evencount);
		System.out.println("PRINT ODD NUMBERS" + " " + oddcount);
		
		for (int i = 0; i < ip.length; i++) {
			System.out.println("ENTER THE VALUE FOR THE POSITION" + " " + i);
			ip[i] = input.nextInt();
//			if (ip[i]==3) {
//				break;
//			}

			
		}
		System.out.println("ENTERED ARRAY VALUES ");
		System.out.println(Arrays.toString(ip));
		// Print the count value
		for (int i : B) {
			if (i == num) {
				count++;

			}
		}
		System.out.println("number of counts " + "  " + count);
		// Array sorting
		Arrays.sort(arr);
		Arrays.sort(name);
		Arrays.sort(ip);
		for (String string : name) {
			System.out.println("sorting arrays" + "   " + string);
		}
		for (int i : arr) {
			System.out.println("sorting arrays" + "   " + i);
		}
		for (int getinput : ip) {
			System.out.println("sorting arrays" + "   " + getinput);
		}
		int min1 = arr[0];
		int max1 = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min1) { //2<4
				min1 = arr[i];	// min = 2
			} // inputs 4, 2, 3, 1
			if (arr[i] > max1) {
				max1 = arr[i];
			}

			if (i == 3) {
				System.out.println("Yes number has present");
			}
		}
		System.out.println("min value" +"   " +min);
		System.out.println("max value" + "   "+max);
//	print the arr
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println(arr[2]);

		// Reverse the Array
		for (int R = B.length - 1; R >= 0; R--) {
			System.out.println("Reverse Order of B" + "  " + B[R]); // inputs 1, 2, 2, 3, 4, 5, 5, 6, 7, 7

		}
		// Reverse the array using without inbuilt methods
	
	}

	public void two_diamention() {
		int a[][] = { { 100, 200, 300 }, { 300, 400, 500 }, { 500, 600, 600 } };

		System.out.println("two diamention print the value for first row second column" + "  " + a[0][1]);
		System.out.println("two diamention number of row" + "   " + a.length);
		System.out.println("Two diamention numer of column" + "   " + a[0].length);

		// iterate first column
		for (int c = 0; c < a.length; c++) {

			System.out.println("First coloum" + "  " + a[c][0] + "   ");
		}
		// iterate first row
		for (int r = 0; r < a.length; r++) {
			System.out.println("Iterate first row" + "  " + a[0][r]);
		}

		for (int r = 0; r <= 2; r++) {
			for (int c = 0; c <= 2; c++) {

				System.out.print(a[r][c] + "   ");
			}
			System.out.println();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("checking"+"  "+a[2][0]);
			
		}
	}

	public static void main(String[] args) {

		Array obj = new Array();
		obj.single_diamention_();
		obj.two_diamention();
	}

}
