package client;
import bus.*; 

public class CounterApplication4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c1 = new Counter("123BXA678" , 5);		
		CustomCounter cc1 = new CustomCounter("777XZA123" , 20, 5);
		
		DataCollection.add(c1);
		DataCollection.add(cc1);
		
		System.out.println("\n List of counters");
		DataCollection.print();
		
System.out.println("\n Searching for the serial number 777XZA123:");  
//-1- first way:	to search and to print
    Counter temporaryObject = null;	
    
    temporaryObject = DataCollection.search("777XZA123") ;

		if( temporaryObject != null)
		{	
		  System.out.println(" Counter found: " + temporaryObject);
		}
		else
		{
			System.out.println(" Counter NOT found: " + temporaryObject);
		}
				
//-2- second way:	to search and to print
 //  System.out.println("Counter with the serial number(999XZA123) is:  "  + DataCollection.search("999XZA123")) ;
		
	}
}

/*
Test 01:
******
 List of counters

		Counter [serialNumber=123BXA678, value=5]
		Counter [serialNumber=777XZA123, value=20]CustomCounter [step=5]


 Searching for the serial number 777XZA123: 

            Counter NOT found: null
            
            
Test 02:
*******                
List of counters
Counter [serialNumber=123BXA678, value=5]
Counter [serialNumber=777XZA123, value=20]CustomCounter [step=5]

 Searching for the serial number 777XZA123:
 Counter found: Counter [serialNumber=777XZA123, value=20]CustomCounter [step=5]

 
 */
