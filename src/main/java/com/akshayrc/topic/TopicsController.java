package com.akshayrc.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@RequestMapping("/GetTopics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("001","Spring","Framework"),
				new Topic("002","Java","Programming Language"),
				new Topic("003","Python","Scripting Language")
				);
	}

}
