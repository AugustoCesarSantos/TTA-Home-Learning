package employee;

public class Employee {
// variable -> attribute
	int eid;
	String ename;
	double salary;
	String email;
	String department;
	
// methods
	public int getEid() {
	return eid;
	}
	public void setEid(int eid) {
	this.eid = eid;
	}
			
	public String getEname() {
	return ename;
	}
	public void setEname(String ename) {
	this.ename = ename;
	}
			
	public double getSalary() {
	return salary;
	}
	public void setSalary(double salary) {
	this.salary = salary;
	}
		
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
			
	public String getDepartment() {
	return department;
	}
	public void setDepartment(String department) {
	this.department = department;
	}
	
// Main method- to run program	
	public static void main(String[] args) {
// create object of class employee
	Employee e1 = new Employee();// creating object using constructor
	Employee e2 = new Employee();// creating object using constructor
	Employee e3 = new Employee();// creating object using constructor
	Employee e4 = new Employee();// creating object using constructor
//using set method setting Employee's attribute
	e1.setEid(101);
	e1.setEname("John Lennon");
	e1.setSalary(4130.55);
	e1.setEmail("john.lennon@thebeatlesjava.co.uk");
	e1.setDepartment("Marketing");

	e2.setEid(102);
	e2.setEname("Paul McCartney");
	e2.setSalary(3800.25);
	e2.setEmail("paul.mccartney@thebeatlesjava.co.uk");
	e2.setDepartment("Finance");
	
	e3.setEid(103);
	e3.setEname("George Harrison");
	e3.setSalary(3400.29);
	e3.setEmail("george.harrison@thebeatlesjava.co.uk");
	e3.setDepartment("HR");
	
	e4.setEid(104);
	e4.setEname("Ringo Starr");
	e4.setSalary(3190.25);
	e4.setEmail("ringo.star@thebeatlesjava.co.uk");
	e4.setDepartment("Sales");
	
//using get method display Employee data -> e1, e2, e3 and e4
	System.out.println(e1.getEid());
	System.out.println(e1.getEname());
	System.out.println(e1.getSalary());
	System.out.println(e1.getEmail());
	System.out.println(e1.getDepartment());
	System.out.println("=======================");
	
	System.out.println(e2.getEid());
	System.out.println(e2.getEname());
	System.out.println(e2.getSalary());
	System.out.println(e2.getEmail());
	System.out.println(e2.getDepartment());
	System.out.println("=======================");
	
	System.out.println(e3.getEid());
	System.out.println(e3.getEname());
	System.out.println(e3.getSalary());
	System.out.println(e3.getEmail());
	System.out.println(e3.getDepartment());
	System.out.println("=======================");
	
	System.out.println(e4.getEid());
	System.out.println(e4.getEname());
	System.out.println(e4.getSalary());
	System.out.println(e4.getEmail());
	System.out.println(e4.getDepartment());
	System.out.println("=======================");
	
// Display Employee information using String -> e1, e2, e3 and e4
	System.out.println("Employee ID : "+e1.getEid());
	System.out.println("Employee Name : "+e1.getEname());
	System.out.println("Employee Salary : "+e1.getSalary());
	System.out.println("Employee Email : "+e1.getEmail());
	System.out.println("Employee Department : "+e1.getDepartment());
	System.out.println("=======================");
	
	System.out.println("Employee ID : "+e2.getEid());
	System.out.println("Employee Name : "+e2.getEname());
	System.out.println("Employee Salary : "+e2.getSalary());
	System.out.println("Employee Email : "+e2.getEmail());
	System.out.println("Employee Department : "+e2.getDepartment());
	System.out.println("=======================");
	
	System.out.println("Employee ID : "+e3.getEid());
	System.out.println("Employee Name : "+e3.getEname());
	System.out.println("Employee Salary : "+e3.getSalary());
	System.out.println("Employee Email : "+e3.getEmail());
	System.out.println("Employee Department : "+e3.getDepartment());
	System.out.println("=======================");
	
	System.out.println("Employee ID : "+e4.getEid());
	System.out.println("Employee Name : "+e4.getEname());
	System.out.println("Employee Salary : "+e4.getSalary());
	System.out.println("Employee Email : "+e4.getEmail());
	System.out.println("Employee Department : "+e4.getDepartment());
	System.out.println("=======================");
	
	
	}
}


	
	
	
	
	
	
	
	