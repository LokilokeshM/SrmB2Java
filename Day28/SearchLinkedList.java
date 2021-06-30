package Day28;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SearchLinkedList {
	public static void main(String[] args)
    {
        List<String> ll = new LinkedList<String>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        ll.add("e");
        ll.add("a");
        ll.add("a");
        ll.add("a");
        System.out.println(ll.contains("Welcome")); 
        System.out.println(ll.contains("Java")); 
    }
}
