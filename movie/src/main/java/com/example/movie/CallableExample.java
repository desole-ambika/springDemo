package Starter;


import java.util.ArrayList;
import java.util.concurrent.Callable;

public class CallableExample implements Callable<Beans>{
	
	private String name;
	private String empId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	@Override
	public Beans call() throws Exception {
		return new Beans(this.name, this.empId);
	}

}
