package com.platzi.hb.dao;

import java.util.List;

import com.platzi.hb.model.Teacher;

public interface TeacherDao {

	public void saveTeacher(Teacher teacher);
	
	public void deletedTeacherById(Long idTeacher);
	
	public void updateTeacher(Teacher teacher);
	
	public List<Teacher> findAllTeacher();
	
	public Teacher findById(Long idTeacher);
	
	public Teacher findByName(String name);
}
