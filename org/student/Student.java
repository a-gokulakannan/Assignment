package org.student;

import org.department.Department;

public class Student extends Department  {
public void studentName(String name) {
	System.out.println("Student Name :"+name);
}
public void studentDept(String dept) {
	System.out.println("Student Department :"+dept);
}
public void studentId(int id) {
	System.out.println("Student ID :"+id);
}

public static void main(String[] args) {
	Student detail=new Student();
	detail.collageName("SRM IST");
	detail.collageCode(238);
	detail.collageRank("A+");
	detail.deptName("CSE");
	detail.studentName("kannan");
	detail.studentDept("CSE");
	detail.studentId(425);
}
}
