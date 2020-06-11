package com.akshayrc.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@RequestMapping("/GetTopics")
	public String getTopics() {
		return "These are topics";
	}

}
