package gopal.org;

import java.util.Iterator;

public class String_mehods {
 public static void stringvalidation() {
	
	 
	 
//	 System.out.println(s.length());
//	 System.out.println(s.charAt(4));
//	 System.out.println(s.compareTo(c));
//	 System.out.println(s.concat(c));
//	 System.out.println(s.trim());
	 
	 String[] s = {"Lenghth of the string"};
	 String c = "Compare the string";
	 String Palindrome = "RACECAR"; 
	 String m= s[0];
	 String rev= "";
	// Palindrome. 
 for (int i = Palindrome.length()-1; i >=0; i--) {
		 rev = rev+Palindrome.charAt(i);	
	}
 if (rev.equalsIgnoreCase(Palindrome)) {
	System.out.println("YES IT IS A PALINDROME");
} else {
System.out.println("YES IT IS NOT A PALINDROME");
}
 //STRING BUILDER METHID FOR PALINDROME
	 StringBuilder builder = new StringBuilder(Palindrome);
	String palin = builder.reverse().toString();
	System.out.println("String Builder METHOD palindrome" +"  "+ palin);
	if (palin.equals(Palindrome) ) {
		System.out.println("YES IT IS A PALINDROME USING BUILDER METHOD");
		
	} else {
		System.out.println("YES IT IS NOT A PALINDROME USING BUILDER METHOD");

	}
	 
	String lowercase=  c.toLowerCase();
	String upperCase = c.toUpperCase();
	System.out.println("String lower case "  +  lowercase);
	System.out.println("String Upper case "  +  upperCase);
	
	 //Normal Reverse String conversation
	 for(int i = c.length()- 1; i >= 0; i--) {
        rev= rev+c.charAt(i);
	 }

	 //REVERSE STRING USING String builder
	 StringBuilder d= new StringBuilder(m);
	 String Reverse_string = d.reverse().toString();
	 System.out.println("String Revesed "+"   "+Reverse_string);
	 
	 //REVERSE STRING USING CharArray
	 char[] charArray = c.toCharArray();
	 for(int i = charArray.length-1; i >=0; i--) { 
         System.out.println("Reverse the string unsing charAt"+"   "+charArray[i]);
     }
	 
	 //REVERSE STRING USING chartAt
	 for(int i = s.length- 1; i >= 0; i--) {
         System.out.println(m.charAt(i));
     }
	 
	 
	 
	 int a = 1;
	 int b =2;
	 System.out.println(a==b);
	 System.out.println(a=b);
	 
	 }
 
 
	 
	
 
 
 public static void main(String[] args){
	 String_mehods obj =new String_mehods();
	 obj.stringvalidation();
	 
 	 
 }

 }
	
		
	
	

