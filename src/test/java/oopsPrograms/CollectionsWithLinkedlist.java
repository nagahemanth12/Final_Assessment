package oopsPrograms;

import java.util.LinkedList;

public class CollectionsWithLinkedlist {
	public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();
 
        // Adding elements to the linked list
        ll.add("Hemanth");
        ll.add("Kiran");
        ll.addLast("Anil");
        ll.addFirst("Ramesh");
        ll.add(2, "Anirudh");
        System.out.println(ll);
        ll.remove("Anil");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);
    }
}
