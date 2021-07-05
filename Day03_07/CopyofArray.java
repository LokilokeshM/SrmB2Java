package Day03_07;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyofArray {
	 public static void main(String[] args){
	        CopyOnWriteArrayList<String> arr = new CopyOnWriteArrayList<>();
			arr.add("Cony");
	        arr.add("Brown");
	        arr.add("John");
	        arr.add("Mathew");
	        arr.add("Sumathy");
	    	System.out.println("ArralyListElements: "+arr);
			for(String i:arr) 
			{
				int l=i.length();
				if(l%2==0) 
				{
					arr.remove(i);
				}
			}
			System.out.println("After Remove Operation(using CopyOnWriteArrayList): "+arr);
	    }
}
