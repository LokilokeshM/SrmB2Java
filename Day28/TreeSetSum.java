package Day28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetSum {
	
	public static int recurSum(int n)
    {
        if (n <= 1)
            return n;
        return n + recurSum(n - 1);
    }
	
	void usingForLoop(TreeSet<Integer> s)
	{
		int sum=0;
		for(Integer i:s) {
        	sum=sum+i;
        }
		System.out.println("Sum For Loop ===>" +sum);
	}
	void usingWhileLoop(TreeSet<Integer> s)
	{
		int sum=0;
		Iterator itr=s.iterator();
        while(itr.hasNext())
        {
        	int i=(int) itr.next();
        	sum=sum+i;
        }
	}
	public static void main(String[] args)
    {
        TreeSet<Integer> list = new TreeSet<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(10);
        list.add(9);
        new TreeSetSum().usingForLoop(list);
        new TreeSetSum().usingWhileLoop(list);
        for(Integer i:list) {
        	System.out.println("Recursion Sum ====>"+TreeSetSum.recurSum(i));
        }
    }	
}
