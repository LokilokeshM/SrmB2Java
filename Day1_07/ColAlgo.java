package Day1_07;

import java.util.ArrayList;
import java.util.Collections;

public class ColAlgo {
	public static void main(String[] args) {

		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("a");
		mylist.add("b");
		mylist.add("c");
		mylist.add("d");
		System.out.println("Original List : \n" + mylist);
		Collections.swap(mylist, 1, 2);

		System.out.println("\nAfter swap(mylist, 1, 2) : \n" + mylist);
		Collections.swap(mylist, 3, 1);

		System.out.println("\nAfter swap(mylist, 3, 1) : \n" + mylist);
		System.out.println("Original List : \n" + mylist);	 
		
        Collections.shuffle(mylist);
        
        System.out.println("\nShuffled List : \n" + mylist);
        
        
        System.out.println("Original List : \n" + mylist);
        
        Collections.reverse(mylist);
        
        System.out.println("Reverse List : \n" + mylist);
     		
	}
}
