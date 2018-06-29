package org.employeejava;

import java.util.ArrayList;
import java.util.Iterator;


public class DepartmentDao
{
	 private ArrayList<DepartmentBean>deprtments=new ArrayList<DepartmentBean> ();
	
	
  public ArrayList<DepartmentBean> getDeprtments() {
		return deprtments;
	}
public DepartmentBean addDepartment(int id,String name)
  {
	  DepartmentBean e1=new DepartmentBean();
	  e1.setId(id);
	  e1.setName(name);
	 
	
	deprtments.add(e1);
	return e1;

	
	
  }
public int deletDepartment(int id)
{
	int deletes=0;
	for (int i = 0; i < deprtments.size(); i++) {
		DepartmentBean employeeBean = deprtments.get(i);
		if(employeeBean.getId()==id)
		{
			deprtments.remove(i);
			deletes++;
			i--;
		}
	}
	return deletes;
	
   
}

public int updaDepartment(int id,String name,double salary)
{
	int updates=0;
	for (int i = 0; i < deprtments.size(); i++) {
		DepartmentBean employeeBean = deprtments.get(i);
		if(employeeBean.getId()==id)
		{
			employeeBean.setName(name);
			updates++;
			
		}
	}
	return updates;
}
}


