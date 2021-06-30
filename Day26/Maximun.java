package Day26;

import java.util.ArrayList;
import java.util.Scanner;

public class Maximun {
	public static <E extends Comparable<E>> E max(E[] list) 
	  {
		
		    for(int i=0;i<list.length;i++){
		    	System.out.println(" "+list[i]);
		    }
		    System.out.println();
	        E max = list[0]; 
	        for (int i = 1; i < list.length; i++) 
	        {
	            if (list[i].compareTo(max) >0) 
	            {
	                max = list[i];
	            }

	        }
	        return max;
	  }
 
	public static void main(String[] args) 
	{
	
		System.out.println("Max Value");
		System.out.println("`````````````````````````````````````````````````\n");
		Integer[] intArray= {1,25,3,40,5};
		String[] strArray= {"Star","Moon","Asteroids","Zen"};
		System.out.println("Integer Array: ");
		System.out.println("\nThe Maximum Value in the IntArray: "+max(intArray));
		System.out.println("-----------------------------------");
	    System.out.println("String Array: ");
	    System.out.println("\nThe Maximum Value in the StrArray: "+max(strArray));
	}
}
