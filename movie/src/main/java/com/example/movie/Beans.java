package Starter;

public class Beans {

	private String names;
	private String empId;
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public Beans(String names, String empId) {
		super();
		this.names = names;
		this.empId = empId;
	}
	public Beans() {
		// TODO Auto-generated constructor stub
	}
	
}
