package Day1_07;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Account {
	
	public TreeMap<Integer,Double> addData() {
		TreeMap<Integer,Double> tmap=new TreeMap<Integer,Double>();
		tmap.put(120, 25000.00);
		tmap.put(178, 40789.35);
		tmap.put(108, 15000.20);
		tmap.put(170, 80000.00);
		tmap.put(200, 45000.00);
		return tmap;
	}
	
	public void Display(TreeMap tm)
	{
		System.out.print(tm);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer,Double> tmap=new TreeMap<Integer,Double>();
		tmap.putAll(new Account().addData());
		//Display
		System.out.println("Account Details ");
		new Account().Display(tmap);
		
		
		System.out.println(" \n Enter Acc.No: ");
		int a=sc.nextInt();
		if(tmap.containsKey(a))
		{
			System.out.println(" \n Account balance("+a+"): "+tmap.get(a));
		}
		else
		{
			System.out.println("\n Account Not found...");
		}
	}
}
