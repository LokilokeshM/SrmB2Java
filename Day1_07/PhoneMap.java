package Day1_07;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneMap {
	
	
	public static void FindByNumber(TreeMap tmap,String s1)
	{
		if (tmap.containsKey(s1)) {
			System.out.println("PhoneNumber: " + tmap.get(s1));
		} else {
			System.out.println("Name not Found...");
		}
	}
	public static void FindByName(TreeMap tmap,String s) {
		if (tmap.containsKey(s)) {
			System.out.println("Old PhoneNumber:" + tmap.get(s));
			tmap.replace(s, 54781001);
			System.out.println("Updated PhoneNumber: " + tmap.get(s));
			System.out.println("\nDirectory (Post Updation): ");
			display(tmap);
		} else {
			System.out.println("Name not Found...");
		}
	}
	public static void display(TreeMap<String, Integer> tmapt) {
		for (Map.Entry<String, Integer> e : tmapt.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
	
	public TreeMap addData()
	{
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
		tmap.put("kishor",97105260);
		tmap.put("loki", 40115478);
		tmap.put("srianth", 87455478);
		return tmap;
		
	}
	//Main Class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
		tmap.putAll(new PhoneMap().addData());
		
		//Display
		System.out.println("Data ");
		display(tmap);
		
		System.out.println("\nEnter The Numbe: ");
		String s1 = sc.next();
		FindByNumber(tmap, s1);
	
		System.out.println("\n Enter The Name: ");
		String s = sc.next();
		FindByName(tmap, s);
	}
}
