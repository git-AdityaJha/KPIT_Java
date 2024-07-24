package entity;

 //1. pojo
public class Department { //mapped with mydept10 TABLE
	private int departmentNumber; //COlumn
	private String departmentLocation; //column
	private String departmentName; //column
	
	//JPA
	
	public Department() {
		super();
		System.out.println("Department() ctor....");
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}