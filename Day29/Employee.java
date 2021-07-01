package Day29;

public class Employee {
	public int eno;
	public String name;
	public String designation;
	public Employee(int eno, String name, String designation) {
		super();
		this.eno = eno;
		this.name = name;
		this.designation = designation;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
