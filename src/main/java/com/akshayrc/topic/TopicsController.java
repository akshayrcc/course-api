package com.akshayrc.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/GetTopics")
	public List<Topic> getAllTopics() {
		return  topicService.getAllTopics();
	}

}
