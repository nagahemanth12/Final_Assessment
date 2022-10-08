package oopsPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionWithArraylist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Comparable> values=new ArrayList();
		values.add("Hemanth");
		values.add(100);
		values.add(25);
		Iterator<Comparable> i= values.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
	
		}
		values.remove(25);
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
		values.add(2);
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
	}

}
