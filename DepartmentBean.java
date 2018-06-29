package org.employeejava;

import java.util.ArrayList;

public class DepartmentBean


{
	int id;
	String name;
	ArrayList<Integer>members=new ArrayList<Integer> ();
	
	 public void addMember(int id)
	  {
		 
		
		  members.add(id);

		
		
	  }
	public void deletMember(int id)
	{
		
		for (int i = 0; i < members.size(); i++) {
			Integer memberId = members.get(i);
			if(memberId==id)
			{
				members.remove(i);
				i--;
			}
		}
		
	   
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "DepartmentBean [id=" + id + ", name=" + name + ", members=" + members + "]";
	}
	
	
}
