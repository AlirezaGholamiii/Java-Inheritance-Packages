package client;

import java.util.Scanner;

import bus.Counter;
import bus.CustomCounter;
import bus.DataCollection;

public class CounterApplicationV5 {
	
	public static void main(String args[])
	{
		
		//Dynamic console application
		Scanner keyboard = new Scanner(System.in);
		
		Counter c1 = new Counter("123BXA678" , 5);		
		CustomCounter cc1 = new CustomCounter("777XZA123" , 20, 5);	
		
		
		//In this case, we mustr validate data in the client side ( FRONT-END) developper
		/////////////////////////////
		
		//CustomCounter cc1 = new CustomCounter("777XZA123" , "Blue" ,  20, 5);	
		
		CustomCounter cc2 = new CustomCounter("111XZA123" , 10, 7);
		CustomCounter cc3= new CustomCounter("8765XZBX123" , 20, 15);
		
		DataCollection.add(c1);  DataCollection.add(cc1);  DataCollection.add(cc2);   DataCollection.add(cc3);
		
		System.out.println("\n List of counters");
		DataCollection.print();
		
		
		System.out.println("\n List of customer counters");		
		System.out.println(DataCollection.getCustomCounters() )  ;		
		
	}

}

/*
  List of counters
Counter [serialNumber=123BXA678, value=5]
Counter [serialNumber=777XZA123, value=20]CustomCounter [step=5]
Counter [serialNumber=111XZA123, value=10]CustomCounter [step=7]
Counter [serialNumber=8765XZBX123, value=20]CustomCounter [step=15]

 List of customer counters[
 Counter [serialNumber=777XZA123, value=20]CustomCounter [step=5]
 Counter [serialNumber=111XZA123, value=10]CustomCounter [step=7]
 Counter [serialNumber=8765XZBX123, value=20]CustomCounter [step=15] ]


 */


















/*
 * 	System.out.println("\n List of custom counters");
		System.out.println(   DataCollection.getCustomCounters()     );
		
		***/
