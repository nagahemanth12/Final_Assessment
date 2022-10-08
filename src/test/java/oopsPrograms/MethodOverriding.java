package oopsPrograms;

class offer
	{
		int Offersforfestivel()
		{
			return 0;
		}
		
	}
	class dasara extends offer
	{
		int Offersforfestivel()
		{
			return 70;
		}
	}
	class deepavali extends offer
	{
		

		int Offersforfestivel()
		{
			return 60;
		}
	}


	public class MethodOverriding {
		public static void main(String[] args) {
		dasara obj1=new dasara();
		deepavali obj2=new deepavali();
		System.out.println("The dasara festival offers are out and their is discount on all products up to "+obj1.Offersforfestivel()+"%");
		System.out.println("The deepavali festival offers are out and their is discount on all products up to "+obj2.Offersforfestivel()+"%");
		
		
	}
	}

