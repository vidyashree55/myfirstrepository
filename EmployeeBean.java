package org.employeejava;

public class EmployeeBean
{
	int empid;
	String ename;
	double salary;
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeBean [empid=" + empid + ", ename=" + ename + "]";
	}
	public int getId() {
		return empid;
		}
		public void setId(int id) {
		 this.empid = id;
		}
		public String getName() {
		return ename;
		}
		public void setName(String name) {
		this.ename = name;
		}

}
