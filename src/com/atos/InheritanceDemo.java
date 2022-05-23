package com.atos;


public class InheritanceDemo {

	public static void main(String[] args) {
		/*Employee emp=new Employee(101, "Megha", "Developer");
		System.out.println(emp);
		Employee emp1=new Employee(102, "Deepu", "jr.Developer");
		System.out.println(emp1);*/

	//early binding
/*	Manager mgr=new Manager(101, "Megha", "Developer",202);
	mgr.display();
	//Manager mgr1=new Manager(202, "Deepu", "jr.Developer",301);
	
	//late binding
	Employee mgr1=new Manager(202, "Deepu", "jr.Developer",301);
	System.out.println(mgr);
	mgr1.display();
	System.out.println(mgr1);  */

	Student st=new Student();
	st.setStudentid(101);
	st.setStudentname("Ram");
	st.setStudentmarks(65);
	st.setStudentstatus(true);
	System.out.println(st);
	
st.setStudentmarks(85);
System.out.println(st);
System.out.println("================================================");
Student st1=new Student(102,"Raj", 65, false);
System.out.println(st1);
st1.setStudentmarks(70);
System.out.println(st1);

Student st2=new Student(103,"Rose", 85, true);
System.out.println(st2);
st1.setStudentmarks(90);
System.out.println(st2);
System.out.println("new update");
	}
	
	}
