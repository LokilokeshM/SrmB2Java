package Day29;

import java.util.LinkedList;
import java.util.List;

public class EmployeeMainClass {
	public static void main(String args[]) {
		List<Employee> le=new LinkedList<Employee>();
		
		le.add(new Employee(1, "loki", "sample"));
		le.add(new Employee(2, "loki", "sample"));
		le.add(new Employee(3, "loki", "sample"));
		le.add(new Employee(4, "loki", "sample"));
		le.add(new Employee(5, "loki", "sample"));
		le.add(new Employee(6, "loki", "sample"));
		le.add(new Employee(7, "loki", "sample"));
		
		for(Employee e:le)
		{
			System.out.println(e.toString());
		}
	}
}	
