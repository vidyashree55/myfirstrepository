package org.employeejava;

import java.util.ArrayList;
import java.util.Iterator;



public class EmployeeDao
{
	private ArrayList<EmployeeBean>employyes=new ArrayList<EmployeeBean> ();
	
	
  public ArrayList<EmployeeBean> getEmployyes() {
		return employyes;
	}
public EmployeeBean addEmployee(int id,String empname,double salary)
  {
	  EmployeeBean e1=new EmployeeBean();
	  e1.setId(id);
	  e1.setName(empname);
	  e1.setSalary(salary);
	  employyes.add(e1);
	
	   System.out.println("------------------------");
	   for (int i = 0; i < employyes.size(); i++)
	   {
		Object obj=employyes.get(i);
		if(obj instanceof EmployeeBean){
			EmployeeBean e2=(EmployeeBean)obj;
			
		}
	   }
	   
	   return e1;
	
  }
public int deleteemployee(int id)
{
	int deletes=0;
	for (int i = 0; i < employyes.size(); i++) {
		EmployeeBean employeeBean = employyes.get(i);
		if(employeeBean.getId()==id)
		{
			employyes.remove(i);
			deletes++;
			i--;
		}


	}
	return deletes;
}

public int updateemployee(int id,String name,double salary)
{
	int updates=0;
	for (int i = 0; i < employyes.size(); i++) {
		EmployeeBean employeeBean = employyes.get(i);
		if(employeeBean.getId()==id)
		{
			employeeBean.setName(name);
			employeeBean.setSalary(salary);
			updates++;
		}
	}
	return updates;

	
}
public void display()
{
	
}
}


