package com.akshayrc.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics = Arrays.asList(
			new Topic("001","Spring","Framework"),
			new Topic("002","Java","Programming Language"),
			new Topic("003","Python","Scripting Language")
			);

	public List<Topic> getAllTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
}
