package client;

import java.util.Scanner;

import bus.CustomCounter;
import bus.EnumColor;

public class CounterApplicationV6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
	CustomCounter cc1 = null;			
	CustomCounter cc2 = null;
	CustomCounter cc3 = null ;
	
	CustomCounter cc4 = null;	
	
	EnumColor color  = EnumColor.Undefined;
	
	cc1 = new CustomCounter("777XZA123" , 20, 5     );
	cc2 = new CustomCounter("777XZA123" , 20,EnumColor.Dark, 5);
	cc3 = new CustomCounter("777XZA123" , 20,EnumColor.White, 5);	
	
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
				
				}
	
	System.out.println("step ? : ");
	int step = scan.nextInt();
	
	cc4 = new CustomCounter(serialNumber, value, color, step);
	
	
	
	
	System.out.println(cc1);
	System.out.println(cc2);
	System.out.println(cc3);
	
	System.out.println(cc4);


	}

}
