package com.adamfgcross.java_data_practice;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adamfgcross.javadatapractice.JavaDataPracticeApplication;
import com.adamfgcross.javadatapractice.domain.Course;
import com.adamfgcross.javadatapractice.service.CourseService;

@SpringBootTest(classes = JavaDataPracticeApplication.class)
public class CourseDataTest {
	
	@Autowired
	CourseService courseService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void getAllCourses() {
		List<Course> courses = courseService.getAll();
		logger.info("courses - {}", courses);
	}
}
