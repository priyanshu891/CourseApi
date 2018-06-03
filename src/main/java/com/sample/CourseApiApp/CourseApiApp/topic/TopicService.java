package com.sample.CourseApiApp.CourseApiApp.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
private	List<Topic> topics = new ArrayList<>( Arrays.asList(
			new Topic("Spring","Spring FrameWork","Spring Framework 2.0.2"),
			new Topic("Java","Core Java","Java 9"),
			new Topic("Javascript","Node JS","AngularJS, NodeJS,MEAN Stack"),
			new Topic("HTML","HTML & CSS","HTML 5 & CSS 3")
			));

public List<Topic> getAllTopics() {
	return topics;
}

public Topic getTopic(String id)
{
return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();	
}

public void addTopic(Topic topic) {
	// TODO Auto-generated method stub
	topics.add(topic);
	
}

}
