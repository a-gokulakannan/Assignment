package org.student;

public class StudentInfo {
public void studentInfo(int id) {
	System.out.println("Student ID :" + id);
}
public void studentInfo(int id, String name) {
	System.out.println("Student ID- " + id + " Student Name- " + name);
}
public void studentInfo(String mail, long number) {
	System.out.println("Student Email- " + mail +" Student Phone Number- " + number);
}

public static void main(String[] args) {
	StudentInfo info=new StudentInfo();
	
	info.studentInfo(425);
	info.studentInfo(425, "kannan");
	info.studentInfo("gokulakannan.ap@gmail.com", 6384985447l);
	
	
}
}
