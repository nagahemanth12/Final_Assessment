package oopsPrograms;

class Login 
{
	void login()
	{
		System.out.println("Login Successfully");	
	}
}
class InheritanceProgram extends Login {

	void afterlogin() 
	{
		System.out.println("Now,The user can start Shopping!!!");
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the Correct login credentials and click Submit");
		InheritanceProgram add = new InheritanceProgram();
			add.login();
			add.afterlogin();
			
	}
}

	


