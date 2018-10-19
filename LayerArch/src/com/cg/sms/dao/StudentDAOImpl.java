package com.cg.sms.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import com.cg.sms.dto.Student;

public class StudentDAOImpl implements StudentDAO {
     
	
	
	Map<Integer,Student> studentMap;
	public StudentDAOImpl(){
		
		
		
		
		studentMap=DataStore.createCollection();
	}
	
	@Override
	public int addStudent(Student student) {
		
		int rollno=(int)(1000*Math.random());
		student.setRollno(rollno);
		studentMap.put(rollno, student);
		
		// TODO Auto-generated method stub
		return rollno;
	}

	@Override
	public Student getStudent(int rn) {
		Student stud=studentMap.get(rn);
		
		// TODO Auto-generated method stub
		return stud;
	}

	@Override
	public Student updateStudent(Student student) {
		studentMap.put(student.getRollno(),student);
		
		// TODO Auto-generated method stub
		return student;
	}
	
	@Override
	public ArrayList<Student> getStudentList(String coursename) {
	Collection<Student> studList=studentMap.values(); 
	ArrayList<Student> students=new ArrayList<>();
	
	for(Student s:studList)
	{
	if(s.getCourseName().equals(coursename)){
		students.add(s);
	}
	}
		
		// TODO Auto-generated method stub
		return students;
	}



	
	
	
}