package oopsPrograms;

public class ExceptionHandlingwithThrowblock {
	 static void m1(int a)
	 {
		 if(a<18)
		 {
			 throw new ArithmeticException();
		 }
		 else
		 {
			 System.out.println("Eligible for applying liecence");
		 }
	 }
	 public static void main(String[] args) {
		 try
		 {
			 m1(21);
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("Not eligible for applying for liecence");
		 }

}
}
