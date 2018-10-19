package com.cg.sms.service;

import java.util.ArrayList;
import java.util.Collection;

import com.cg.sms.dao.StudentDAO;
import com.cg.sms.dao.StudentDAOImpl;
import com.cg.sms.dto.Student;

public class StudentServiceImpl implements StudentService{

	StudentDAO dao;
	public StudentServiceImpl()
	{
		dao=new StudentDAOImpl();
	}
	@Override
	public int addStudent(Student student) {
		int rn=dao.addStudent(student);
		// TODO Auto-generated method stub
		return rn;
	}
	@Override
	public Student getStudent(int rn) {
		return dao.getStudent(rn);
		
		// TODO Auto-generated method stub
		//return null;
	}
	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.updateStudent(student);
	}
	@Override
	public ArrayList<Student> getStudentList(String coursename) {
		// TODO Auto-generated method stub
		return dao.getStudentList(coursename);
	}
	
}
