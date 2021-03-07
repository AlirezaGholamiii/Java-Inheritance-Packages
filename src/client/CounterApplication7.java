package client;

import java.util.Scanner;

import bus.Counter;
import bus.StepCounter;
import bus.EnumColor;
import bus.ICountable;
import bus.ModNCounter;

public class CounterApplicationV7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
	/////////////////////////ICountable c1 = null;	c1 = new Counter();
		
		ICountable sc1 = null;			
		ICountable sc2 = null;
		ICountable sc3 = null ;			
		ICountable sc4 = null;	
		ICountable mc1 = null;		
	
			EnumColor color  = EnumColor.Undefined;	
			sc1 = new StepCounter("777XZA123" , 20, 5     );
			sc2 = new StepCounter("777XZA123" , 20,EnumColor.Dark, 5);
			sc3 = new StepCounter("777XZA123" , 20,EnumColor.White, 5);	         
			System.out.println("Serial number ? : ");
			String serialNumber = scan.nextLine();
			System.out.println("value ? : ");
			int value = scan.nextInt() ;	
			System.out.println("color ? : ");
				System.out.println(" \t 1- Dark color");
				System.out.println(" \t 2- White color");
				System.out.println("  \t\t Choose your color [1-Dark, 2-White]");	
				  switch(scan.nextInt())
					{
					case 1 :
						color = EnumColor.Dark;
						break;					
					case 2:
						color = EnumColor.White;
						break;
					default:
						color = EnumColor.Undefined;
						break;
					}
			System.out.println("enter the step ? : ");
			int step = scan.nextInt();	
			sc4 = new StepCounter(serialNumber, value, color, step);	

	//ModCounter 01
	mc1 = new  ModNCounter("555ABC777" , 7 , EnumColor.Dark , 5) ;  // 7 % 5 = 2 (it contains the remainder)

	System.out.println("\n My counters are: ");
	System.out.println(sc1);
	System.out.println(sc2);
	System.out.println(sc3);	
	System.out.println(sc4);
	System.out.println(mc1);
	
	System.out.println("\n\n get the value of each counter: ");
	System.out.println("c1 : " + sc1.getValue()  );
	System.out.println("c1 : " + mc1.getValue()  );	
	
	scan.close();
	
	}
}
/*
 Serial number ? : 
XYZ45ABC67
value ? : 
10
color ? : 
 	 1- Dark color
 	 2- White color
  		 Choose your color [1-Dark, 2-White]
1
enter the step ? : 
5

 My counters are: 
Counter [serialNumber=777XZA123, value=20, color=Undefined]CustomCounter [step=5]
Counter [serialNumber=777XZA123, value=20, color=Dark]CustomCounter [step=5]
Counter [serialNumber=777XZA123, value=20, color=White]CustomCounter [step=5]
Counter [serialNumber=XYZ45ABC67, value=10, color=Dark]CustomCounter [step=5]
Counter [serialNumber=555ABC777, value=7, color=Dark]


 get the value of each counter: 
c1 : 25
c1 : 2

*/
