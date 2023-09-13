package methodtypes;

public class MethodOverloadingTea {

	public void getTea() 
	{
		System.out.println("The Bill is 10Rs");
		
	}
	public void getTea(int quantity)
	{
		System.out.println("The Bill is "+(quantity*10));
	}
	public void getTea(String type) 
	{
		System.out.println("The Bill for"+type+" Tea is 15Rs");
	}
	public void getTea(int quantity,String type)
	{
		System.out.println("The Bill for "+quantity+" "+type+" teas are "+(quantity*15));
	}

}
