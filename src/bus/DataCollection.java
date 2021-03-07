package bus;
import java.util.ArrayList;

public class DataCollection {
	
	//-1- private static data
	//////////////////////////
	 private static  ArrayList<ICountable>  listOfICountables = new  ArrayList<ICountable>();	
	 
	 //-2- public static operations
	/////////////////////////////// 	 
     public static void add(ICountable object)
	 {
		 listOfICountables.add(object );		 
	 }	 
	 
     public static void remove(ICountable object)
	 {
		 listOfICountables.remove(object);		 
	 }	 
	
     public static void removeAt(int index)
	 {
		 listOfICountables.remove(index);		 
	 }	 
	 
	 public static void print()	 
	 {
		 for(ICountable element : listOfICountables)
		 {
			 System.out.println(element);
			 
		 } 		 
	 } 	 
	  	 
	 //-search for a counter by serial number: unique identifier	 
	 public static ICountable  search(String key)
	 {
			 for( ICountable element : listOfICountables)
			 {
				                            //if(element.getSerialNumber() == key)	 
				 if(element.getSerialNumber().equals(key))
				 {
					 return element ;				 
				 }
			 }		 
	   return null;	   
	 }
	 
	 public static  ArrayList<ICountable>   getICountableList()
	 {   
		   
	      return listOfICountables ;
		 
	 }
	 
	
	 
	 //////////////////////////////////////////////
	 //
	//             How to get the list of specialized counters ?
	 //
	 ///////////////////////////////////////
	 
	 public static  ArrayList<StepCounter>   getStepCounters()
	 {
	   ArrayList<StepCounter>  listOfStepCounters = new ArrayList<StepCounter>();
		 
		   for( ICountable element : listOfICountables)
		   {
			   if(element instanceof StepCounter)
			   {			   
				   listOfStepCounters.add(   ( StepCounter )  element   ) ;   //down-casting		   
			   }  	   
		   }
		   
	      return listOfStepCounters ;
		 
	 }
	 
	 public static  ArrayList<ModNCounter>   getModNCounters()
	 {
	   ArrayList<ModNCounter>  listOfModNCounters = new ArrayList<ModNCounter>();
		 
		   for( ICountable element : listOfICountables)
		   {
			   if(element instanceof StepCounter)
			   {			   
				   listOfModNCounters.add(   ( ModNCounter )  element   ) ;   //down-casting		   
			   }  	   
		   }	
		   
	      return listOfModNCounters ;
		 
	 }
	 
	}




































