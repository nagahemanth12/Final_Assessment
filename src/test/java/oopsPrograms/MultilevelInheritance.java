package oopsPrograms;

//multilevel inheritance and class  MultilevelInheritance will extends  InheritanceProgram (single inheritance)
public class MultilevelInheritance extends InheritanceProgram{
	
		void BookOrder() {
			System.out.println("Now,Book the Order which you wanted to buy!!!");
		
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MultilevelInheritance obj3=new MultilevelInheritance(); 
	     obj3.login();
	     obj3.afterlogin();
	     obj3.BookOrder();
		}
}
