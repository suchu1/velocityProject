package ExceptionHandling;

public class Random {
	public static void main(String[] args) {
		System.out.println("start");
		 	int a= 12 ; 
		    int b = 2;
		    int c = 0 ;
		    int i = 6;
		    int d[] = {12,64,65,84,95};
		  try {  
		    c = a/b ;
		    System.out.println("c execute successfully");
		    System.out.println(d[i]);
		  }
		  catch (ArithmeticException e){
			  System.out.println("arithmatic code for the arithmatic equation");
			  System.out.println("value of the b is 0(zero)");
		  }
//		    	try {
//		    		System.out.println(d[6]);
//		    		}
//		    	catch(ArrayIndexOutOfBoundsException j){
//		    	System.out.println("index = +i+ is not present");
//		    }
//		    	catch(ArrayIndexOutOfBoundsException j){
//			    	System.out.println("index = +i+ is not present");		    	  
		  finally {
			  System.out.println("finally execute");
		  }
		System.out.println(c);
	    System.out.println("end");
	  
	}
	}


