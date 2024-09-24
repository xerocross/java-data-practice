package com.adamfgcross.javadatapractice.dao;

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
}
