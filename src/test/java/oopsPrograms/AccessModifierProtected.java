package oopsPrograms;

class abc{
	protected void method1()
	{
		System.out.println("Hello I'm protected class");
	}
	
}
public class AccessModifierProtected extends abc{
	
	public static void main(String[] args) {
		AccessModifierProtected obj=new AccessModifierProtected();
		obj.method1();
	}
}