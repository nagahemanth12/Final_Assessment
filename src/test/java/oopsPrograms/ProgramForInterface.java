package oopsPrograms;

interface Bank
{
	 abstract void rateofinterest();
	 abstract void duration();
}
class SBI implements Bank{
	public void rateofinterest()
	{
		System.out.println("It charges 9% interest ");

	}
	public void duration() {
		
		System.out.println("For the period of 1 year");
	}
}
public class ProgramForInterface
{
public static void main(String[] args){  
		Bank Obj=new SBI();
		Obj.duration();
		Obj.rateofinterest();
	
}}









