package oopsPrograms;

abstract  class cars
{
	void Enginetype()
	{
		System.out.println("Diesel engine");
	}
	void ChechAC()
	{
		System.out.println("Ac is available");
	}
	abstract void price();
	abstract void totalseats();
}

public class AbstractClassProgram extends cars{
	public static void main(String[] args) {
		AbstractClassProgram obj=new AbstractClassProgram();
		System.out.println("Details of the cars:");
		obj.Enginetype();
		obj.ChechAC();
		obj.price();
		obj.totalseats();
	}
	void price()
	{
		System.out.println("Its a budget range car");
	}
	void totalseats()
	{
		System.out.println("The total number of seats:5");
	}
}
