package bus;

//in C and C++ it's the header.h

public interface ICountable {
	
	public abstract void reset();
	
	public abstract void decrement() ;	
	
	public abstract void increment() ;
	
	public abstract String getSerialNumber();
	
	public abstract int getValue();	  
	
	public abstract int stop();

	
	

}
