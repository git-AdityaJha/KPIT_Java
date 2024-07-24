package company.dept;

public class Department {
	// fields
	int deptNumber;
	String deptName;
	String deptLocation;
	
	// constructor of Department class : to initialize data members
	public Department() {
		super();
		System.out.println("Department constructor called...");
	}

	// getters and setters 
	public int getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLocation() {
		return deptLocation;
	}

	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}

	// toString function : to print all the values of the object
	@Override
	public String toString() {
		return "Department [deptNumber=" + deptNumber + ", deptName=" + deptName + ", deptLocation=" + deptLocation
				+ "]";
	}
}
