package org.employeejava;

import java.util.ArrayList;

public class SamplleService {
	
	public ArrayList<DepartmentBean> process()
	{
		EmployeeDao emp=new EmployeeDao();
		EmployeeBean vidya = emp.addEmployee(123,"vidya",23416.00);
		EmployeeBean vidya1 = emp.addEmployee(124,"vidya1",23416.00);
		System.out.println(emp.getEmployyes());
		emp.deleteemployee(123);
		System.out.println(emp.getEmployyes());
		DepartmentDao dept=new DepartmentDao();
		DepartmentBean dep1 = dept.addDepartment(123, "java");
		System.out.println(dept.getDeprtments());
		DepartmentBean dep2 = dept.addDepartment(124, "hr");
	     System.out.println(dept.getDeprtments());	
	     dep1.addMember(vidya.empid);
	     return dept.getDeprtments();
	     
	}

}
