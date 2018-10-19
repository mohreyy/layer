package com.cg.sms.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.sms.dto.Student;
import com.cg.sms.service.StudentService;
import com.cg.sms.service.StudentServiceImpl;

public class Main {
public static void main(String args[])
{
	
	StudentService service =new StudentServiceImpl();
	
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	int ch=0;
	do{
	System.out.println("1. Add Student");
	System.out.println("2. Display Student Details");
	System.out.println("3. update Details");
	System.out.println("4. Display Student Details");
	System.out.println("enter your choice");
	ch=sc.nextInt();
	switch (ch){
	case 1:

		System.out.println("enter Name  ;");
		String name=sc.next();
	 
	System.out.println("enter Course Name  ;");
	String cname=sc1.next();
	System.out.println("enter age  ;");
	int age=sc1.nextInt();
	
	System.out.println("enter Mobile no.  ;");
	String mob=sc1.next();
	
	
	Student student=new Student();
	student.setName(name);
	student.setCourseName(cname);
	student.setAge(age);
	student.setMobileNo(mob);
	int rn=service.addStudent(student);
	System.out.println("record added..."+ rn);
	
	case 2:

		System.out.println("enter Roll no. ;");
		rn=sc.nextInt();
		 student=service.getStudent(rn);
		 if(student==null)
		 {
			 System.err.println("not found");
		 }
		 System.out.println(student.getName());
		 System.out.println(student.getCourseName());
		 System.out.println(student.getAge());
		 System.out.println(student.getMobileNo());
		
		

	case 3:
		System.out.println("enter roll no");
		rn=sc.nextInt();
		student=service.getStudent(rn);
		if(student==null)
		{
			System.out.println("not found");
			
		}
		else{
			System.out.println("enter Mobile no.  ;");
			String mobno=sc.next();
			student.setMobileNo(mobno);
			student=service.updateStudent(student);
			System.out.println("record updated");
			
			
			System.out.println(student.getName());
			System.out.println(student.getMobileNo());
		}
		
		
	case 4:
		System.out.println("enter course name");
		cname=sc.next();
		
		ArrayList<Student> list=service.getStudentList(cname);
		if(list.size()==0)
		{
			System.out.println("no student enrolled to this record");
		}
		else{
			for(Student s:list){
				System.out.println(s.getName()+" "+s.getMobileNo());
				
			}
		}
		
		break;
	
}
}while(ch!=5);
}}