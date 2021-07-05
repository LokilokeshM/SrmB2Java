package Day03_07;

import java.util.*;
public class ArrayListEx {
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<>();
		arr.add("a");
        arr.add("B");
        arr.add("J");
        arr.add("M");
        arr.add("g");
        System.out.println("ArralyList Elements: "+arr);
		for(String i:arr) 
		{
			int l=i.length();
			if(l%2==0) 
			{
				arr.remove(i);
			}
		}
		System.out.println("After Remove Operation: "+arr);
    }
}