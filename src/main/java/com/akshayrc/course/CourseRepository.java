package com.akshayrc.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{

	/*Spring automatically implements the below method by looking at name, which is correctly formulated as 
	 * it should start with 'find' , then filter word 'by' and then exact entity, if not direct then class name 
	 * and entity */
	
	public List<Course> findByTopicId(String topicId);

}
