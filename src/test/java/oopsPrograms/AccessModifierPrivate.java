package oopsPrograms;

	class pro {
		private int x=100;
		private void method1()
		{
			System.out.println("this is private access modifier only used with in the class");
		}
		 void method2()
		{
			System.out.println("this is default");
		}
	}
	public class AccessModifierPrivate extends pro{
		public static void main(String[] args) {
		pro obj1 = new pro();
			obj1.method2();
			
			//obj1.method1();
	}
	}


