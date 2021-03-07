package bus;

public class ModNCounter extends Counter {
	
	private int maxLimit;
	
	public ModNCounter()
	{
		super();
		maxLimit = 1;				
	}
	public ModNCounter(String serialNumber,  int value,  int max)
	{
		super(serialNumber, value);
		maxLimit = max;	
		
	}
	
	public ModNCounter(String serialNumber,  int value, EnumColor color, int max)
	{
		super(serialNumber, value, color);
		maxLimit = max;	
		
	}
	
	public int getValue()
	{
		// % is the modulus operator; it returns the remainder
		return super.getValue() % maxLimit ;// cycles around from 0 to  maxLimit-1		
	}
	@Override
	public String toString() {
		return super.toString()  + "\t ModNCounter [max limit =" + this.maxLimit + "]\n";
	}
	
	public  int  stop()
    {
        return 1;
    }

}
