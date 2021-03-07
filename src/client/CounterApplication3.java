package client;

import bus.* ;

public class CounterApplication3 {

	public static void main(String[] args) {

		//using the data collection of counters
		
		Counter c1 = new Counter(100);
		CustomCounter cc2 = new CustomCounter(210);
		
		DataCollection.add(c1); 
		DataCollection.add(new CustomCounter(200)); 	
		DataCollection.add(new Counter(110)); 	
		DataCollection.add(cc2 );
		
		System.out.println("\n\n Original Collection \n");
		DataCollection.print();
		
		DataCollection.remove(cc2);		
		System.out.println("\n\n  Collection After removing the fourth element \n");
		DataCollection.print();
		
             DataCollection.removeAt(0);		
		System.out.println("\n\n  Collection After removing the first element \n");
		DataCollection.print();
		
	}
		


}
