package gopal.org;


interface methodoverriding   //overriding we need 2 or more classes to achive.for overloading we can acheicve in single or multiple classes.
{
	
	
	default void dog() {
		System.out.println("method overrinding with dog");
	}
	default void cow() {
		System.out.println("method overrinding with Cow");
	}
//abstract method
	 void bird();
}
																	

//overloading we can acheicve in single or multiple classes.

public class Polymorphism_Encapsulation implements methodoverriding {
	int a = 5; int b = 10;
	int account_number;
	String Name;
	String Location;
//abstract classes
	public void bird () {
		System.out.println("poloymorphism method overrinding with dog working");
	}
	public void dog () {
		System.out.println("method overrinding with dog");
	}
	//polymorphism method overloading
public void add() {
	System.out.println("Just add two numbers"+"   "+a+b);
	
}
void add(String  x , String y) {
	System.out.println("Using String values only"+x+y);
}
void add(int x , int y , double d) {
	System.out.println("Two int values and one double values"+x+y+d);
}

void add(int x , int y , String f) {
	System.out.println("using float values"+x+y+f);
}
void add(int y , double x ) {
	System.out.println("Using double values"+x+y);
}

//Encapuslation
void Setmethod(int account_number ) {

this.account_number=account_number;
		
}

 public int getmethod() {
 return account_number;
 
}

public static void main(String[] args) {
	//reference class name				//object creation
	methodoverriding obj = new Polymorphism_Encapsulation();//
//	obj.add("Nothing","Hello");
//	obj.add();
//	obj.Setmethod(500);
//	System.out.println(obj.getmethod());
	obj.dog();
	
	
}
}
