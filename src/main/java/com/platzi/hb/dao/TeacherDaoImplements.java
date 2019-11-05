package com.platzi.hb.dao;

import java.util.List;

import com.platzi.hb.model.Teacher;

public class TeacherDaoImplements extends CrearSession implements TeacherDao{

	private CrearSession session;
	
	public TeacherDaoImplements() {
		
		session=new CrearSession();
	}

	@Override
	public void saveTeacher(Teacher teacher) {
		
		session.getSession().save(teacher);
		session.getSession().getTransaction().commit();
		
	}

	@Override
	public void deletedTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Teacher> findAllTeacher() {
		// TODO Auto-generated method stub
		return session.getSession().createQuery("from Teacher").list();
	}

	@Override
	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
