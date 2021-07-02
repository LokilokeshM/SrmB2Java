package Day1_07;

import java.util.Map;
import java.util.TreeMap;


public class EmpDetails {
	TreeMap<Integer,Employee> AddData() {
		TreeMap<Integer,Employee> tm=new TreeMap<Integer,Employee>();
		tm.put(1,new Employee(1001,"loki","Senior Dev"));
		tm.put(2,new Employee(1002,"kumar","Programmer"));
		tm.put(3,new Employee(1003,"srianth","Team Lead"));
		tm.put(4,new Employee(1004,"kishor","Trainee"));
		return tm;
	}
	void PrintRecord(TreeMap<Integer,Employee> tm ) {
		System.out.println("Emp Details: ");
		for(Map.Entry<Integer,Employee> i:tm.entrySet())
		{
			System.out.println(i.getKey()+" : "+i.getValue());
		}
	}
	
	
	public static void main(String[] args) {

		TreeMap<Integer,Employee> tm=new TreeMap<Integer,Employee>();
		//AddData
		tm.putAll(new EmpDetails().AddData());
		//Print Datas
		new EmpDetails().PrintRecord(tm);
		System.out.println("\nFirst Record: "+tm.get(1));
		System.out.println("\nEmp Record with Id(1003): "+tm.get(3));
	}
}

