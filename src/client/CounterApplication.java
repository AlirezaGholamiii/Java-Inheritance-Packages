package client;

import bus.Counter; //using with C#
import bus.CustomCounter;

 public class CounterApplication {

	public static void main(String[] args) {

		Counter c1 = new Counter();
		System.out.println("\n-1- Counter: \n \t  initial value: " + c1.getValue() );	
		
		c1.increment(); ;
		System.out.println("\tAfter incrementing the counter: value =  " 
		                    + c1.getValue() + " \n\n"   );
		
	CustomCounter  cc1 = new CustomCounter(100) ;
	
	System.out.println("\n\n -2- Custom counter: \n\t " + cc1);
	}

 }
