package com.org;

public class Manager extends Employee {

	int managerid;
	public Manager(int employeeid, String employeename, String employeedesignation) {
		super(employeeid, employeename, employeedesignation);
		
	}
	public Manager(int employeeid, String employeename, String employeedesignation, int managerid) {
		super(employeeid, employeename, employeedesignation);
		this.managerid = managerid;
	}
	@Override
	public String toString() {
		return "Manager [managerid=" + managerid + ", employeeid=" + employeeid + ", employeename=" + employeename
				+ ", employeedesignation=" + employeedesignation + "]";
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Calling Manager Display");
	}

	
	
}
