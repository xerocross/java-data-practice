package com.adamfgcross.javadatapractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adamfgcross.javadatapractice.dao.CourseDao;
import com.adamfgcross.javadatapractice.domain.Course;

import jakarta.transaction.Transactional;

@Service
public class CourseService {

	@Autowired
	CourseDao courseDao;
	
	@Transactional
	public Course insert(Course course) {
		return courseDao.insert(course);
	}
	
	@Transactional
	public List<Course> getAll() {
		return courseDao.getAll();
	}
}
