package testing_Purpose;

public class Switching {

//	int day;
	public Switching(int day) {
//		this.day = day;
		String dayName;
		 switch(day) {
         case 1:
             dayName = "Monday";
             break;
         case 2:
             dayName = "Tuesday";
             
         case 3:
             dayName = "Wednesday";
             break;
         case 4:
             dayName = "Thursday";
             break;
         case 5:
             dayName = "Friday";
             break;
         case 6:
             dayName = "Saturday";
             break;
         case 7:
             dayName = "Sunday";
             break;
         default:
             dayName = "Invalid day";
         
     }
		 
     // Print the result
     System.out.println("The day is: " + dayName);
     System.out.println("Java version: " + System.getProperty("java.version"));
	}
	// paramaterlized constructor
	public Switching(String x) {
	
		System.out.println("this is an constrctor method but using void");
	}
	
	    public static void main(String[] args) {
	    	Switching obj = new Switching(2);
	      
	    	
	    }
	}



