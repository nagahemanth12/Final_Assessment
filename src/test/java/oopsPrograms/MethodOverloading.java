//program for the searching operation based on the input given.The program is implemented by using the concept of method overloading

package oopsPrograms;

public class MethodOverloading {

	public static void main(String[] args)
	{
		MethodOverloading obj=new MethodOverloading();
		//search by employee id
		obj.search1(12344);
		//search by name;
		obj.search1("Hemanth");
		//search by governament id number,full name on it
		obj.search1(495605178,"K.Naga Hemanth");
	}
	//search by employee_id
	void search1(int employee_id)
	{
		 System.out.println("The employee has been identified by the employee_id which is been given");
		 
	}
	//search by employee_name
	void  search1(String name)
	{
		 System.out.println("The employee details are being identified successfully by the name given as input");
	}

	void search1(long gov_id_number,String Full_Name)
	{
		 System.out.println("The employee details are being identified successfully by the details given as input");
	}

}
