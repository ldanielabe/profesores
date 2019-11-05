package com.platzi.hb;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.platzi.hb.dao.CrearSession;
import com.platzi.hb.dao.TeacherDaoImplements;
import com.platzi.hb.model.Course;
import com.platzi.hb.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       Teacher teacher=new Teacher("Camila","avatar");
       TeacherDaoImplements teacherDao=new TeacherDaoImplements();
       teacherDao.saveTeacher(teacher);
       List<Teacher> listTeacher=teacherDao.findAllTeacher();
       
       for (Teacher t : listTeacher) {
		System.out.println(t.getName());
	}

       
      // Query consulta = sesion.createSQLQuery("SELECT * from Medallas where codDeportista =:codDeportista");
      // consulta.setParameter("codDeportista", codDeportista);
     //Course course=new Course("Bases de datos", "Avanzado", "avatar");
        
    }
}
