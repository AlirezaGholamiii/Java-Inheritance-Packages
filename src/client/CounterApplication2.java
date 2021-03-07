package client;

import bus.* ;

import java.util.ArrayList;

public class CounterApplication2 {

	public static void main(String[] args) {

		//create a collection of counters
		
		ArrayList<Counter>  listOfCounters = new ArrayList<Counter>();
		Counter c1 = new Counter(10);			
		CustomCounter cc1 = new CustomCounter(20, 2);	
		
		listOfCounters.add(c1);
		listOfCounters.add(cc1);
		
      listOfCounters.add(new Counter(15));
      listOfCounters.add(new CustomCounter(40, 4));	

    //-1- first way:
    	System.out.println("\nList of counters: ");			
		for(Counter object :  listOfCounters )	
		{
			System.out.println(object);				
		}		
		
	//-2- second way:
		System.out.println("\nList of custom counters and counters: ");	
		for(Counter object : listOfCounters)
		{			
			if(object instanceof CustomCounter)  //with C# : if(object is CustomCounter)
			{
				System.out.println("\n Custom counter: \n" + object);					
			}
			else if (object instanceof Counter)
			{
				System.out.println("\n Counter: \n" + object);					
			}			
		}
	}

}
