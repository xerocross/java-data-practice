package com.adamfgcross.javadatapractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adamfgcross.javadatapractice.domain.Course;
import com.adamfgcross.javadatapractice.service.CourseService;

@Component
public class DataLoader implements CommandLineRunner {

	@Autowired
	CourseService courseService;
	
	@Override
	public void run(String... args) throws Exception {
		Course javaData1 = new Course(3, "Java Data with Spring");
		courseService.insert(javaData1);
	}
}
