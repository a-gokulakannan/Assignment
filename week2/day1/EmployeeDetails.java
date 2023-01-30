package week2.day1;

public class EmployeeDetails {
public void printEmployeeName(String empName, int empId) {
	String name= empName + empId;
	//*int id=empId;
	System.out.println(name);
}
public void getEmployeeAddress(String empAddress) {
	String address= empAddress;
	System.out.println(address);
}
public void printEmployeeSalary(double empSalary) {
	double salary=empSalary;
	System.out.println(salary);
}
public void printEmployeeMobileNumber(long mobNum) {
	long num=mobNum;
	System.out.println(num);
}
public static void main(String[] args) {
	EmployeeDetails emp=new EmployeeDetails();
	emp.printEmployeeName("AgKannan-", 2324);
	emp.getEmployeeAddress("Virudhunagar");
	emp.printEmployeeSalary(23000.23);
	emp.printEmployeeMobileNumber(6384975448l);
}
}