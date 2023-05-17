class Employee{
	String EmpName;
	int EmpSalary;
	static String CompanyName="TATA";
	Employee(String EmpName,int EmpSalary){
		this.EmpName = EmpName;
		this.EmpSalary = EmpSalary;
	}
	public static void main(String args[]){
		Employee emp1 = new Employee("Vishwajeet",50000);
		Employee emp2 = new Employee("Ajay",50000);
		Employee emp3 = new Employee("Abhimanyu",50000);
		Employee emp4 = new Employee("Raju",50000);
		Employee emp5 = new Employee("Rinshu",50000);
		System.out.println("Employee Name : "+emp1.EmpName+" Employee Salary "+emp1.EmpSalary+" Company Name "+CompanyName);
		System.out.println("Employee Name : "+emp2.EmpName+" Employee Salary "+emp2.EmpSalary+" Company Name "+CompanyName);
		System.out.println("Employee Name : "+emp3.EmpName+" Employee Salary "+emp3.EmpSalary+" Company Name "+CompanyName);
		System.out.println("Employee Name : "+emp4.EmpName+" Employee Salary "+emp4.EmpSalary+" Company Name "+CompanyName);
		System.out.println("Employee Name : "+emp5.EmpName+" Employee Salary "+emp5.EmpSalary+" Company Name "+CompanyName);
	}
}