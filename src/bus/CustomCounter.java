package bus;

public class CustomCounter extends Counter{
	
	private int step;
	
	public CustomCounter() {
		super();
		this.step = 0 ;
	}	
    public CustomCounter(int step) {
		super();
		this.step = step;
	}  
    public CustomCounter(int value, int step) {
		super(value);
		this.step = step;
	}
    public CustomCounter(String serialNumber, int value, int step) {
		super(serialNumber, value);
		this.step = step;
	}
    
    public CustomCounter(String serialNumber, int value, EnumColor color, int step ) {
		super(serialNumber,  value,  color);
		this.step = step;
	}  
    
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	
		@Override
	public String toString() {
		return super.toString()  + "CustomCounter [step=" + step + "]";
	}
	@Override
	public void increment( )//the body of the method is the behavior of the object
	{
		this.setValue(this.getValue() + this.step );		
	}	
	@Override
	public void decrement()
	 {
		this.setValue(  this.getValue() - this.step);
     }

	
    public void increment(int step)
    {		   
	   this.setValue(this.getValue() +  step);		   
    }   
    public void decrement(int step)
    {	  
	   this.setValue(this.getValue() -  step);		   
    }

}
