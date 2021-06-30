package Day26;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
	public static void main(String[] args) 
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number");
		int n =sc.nextInt();
	    Queue<Integer>Qlist = new LinkedList<Integer>(); 
	    for (int i=0; i<n; i++) 
	    	Qlist.add(i); 

	    System.out.println("Elements of Queue : "+Qlist); 
	  
	    int remove= Qlist.remove(); 
	    System.out.println("Removed element from the Queue : " + remove); 
	    System.out.println(Qlist); 
	  
	    int head = Qlist.peek(); 
	    System.out.println("head of queue=" + head); 
	    
	    int size= Qlist.size(); 
	    System.out.println("Size of queue=" + size); 
	  
	} 
}
