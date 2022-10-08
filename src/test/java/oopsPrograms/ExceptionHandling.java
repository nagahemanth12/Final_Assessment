package oopsPrograms;

public class ExceptionHandling {
	public static void main(String[] args) {

		int x[]=new int[6];
	try
	{
		 x[7]=10/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Math exception is occured");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		
		System.out.println("Array out of bound exception");
	}
	finally
	{
		
		System.out.println("Finally block always executes");
	}
	}
}
