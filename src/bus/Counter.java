package bus;

public abstract class   Counter implements ICountable{	
	
	 private String serialNumber;       
     private  EnumColor color ;
     //Date madeDate;
     
     private int value;	 
     
     // private String model
	
	public Counter() {
		super();
		this.serialNumber = "Undefined";
		value = 0 ;
		this.color = EnumColor.Undefined ;
	}
	public Counter( int value) {
		super();
		this.serialNumber = "Undefined";
		this.value = value;
		this.color = EnumColor.Undefined ;
	}
	public Counter(String serialNumber, int value) {
		super();
		this.serialNumber = serialNumber ;
		this.value = value;
		this.color = EnumColor.Undefined ;
	}
	public Counter(String serialNumber, int value, EnumColor color) {
		super();
		this.serialNumber = serialNumber ;
		this.value = value;
		this.color = color ;
	}		
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
		
	public EnumColor getColor() {
		return color;
	}
	public void setColor(EnumColor color) {
		this.color = color;
	}		
	@Override
	public String toString() {
		return "Counter [serialNumber=" + serialNumber + " | value=" + value + " | color=" + color + "]\n";
	}
	//public services(operations)
	public void increment()	{
		value++;		
	}	
	public void decrement()	{
		value--;		
	}
	public void reset()	{
		this.value = 0; 	
	}
	public abstract int stop();
}

