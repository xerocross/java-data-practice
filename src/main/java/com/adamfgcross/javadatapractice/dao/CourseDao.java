package com.adamfgcross.javadatapractice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adamfgcross.javadatapractice.domain.Course;

import jakarta.persistence.EntityManager;

@Repository
public class CourseDao {

	@Autowired
	EntityManager em;
	
	public Course insert(Course course) {
		return em.merge(course);
	}
	
	public Course update (Course course) {
		return em.merge(course);
	}
	
	public List<Course> getAll() {
		List<Course> resultsList = em.createQuery("Select c from Course c", Course.class).getResultList();
		return resultsList;
	}
}
