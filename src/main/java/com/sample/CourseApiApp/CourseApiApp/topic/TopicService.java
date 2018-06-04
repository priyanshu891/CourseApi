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
/*-----------------Get All Topics--------------------*/

public List<Topic> getAllTopics() {
	return topics;
}

/*-----------------Get a Topic----------------------*/

public Topic getTopic(String id)
{
return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();	
}

/*-----------------Adding Topic--------------------*/

public void addTopic(Topic topic) {
	topics.add(topic);	
}

/*-----------------Updating Topic--------------------*/

public void updateTopic(String id, Topic topic) {
	for(int i=0;i < topics.size();i++) {
		Topic t = topics.get(i);
		if(t.getId().equals(id)) {
			topics.set(i, topic);
			return;
		}
	}
}

/*-----------------Deleting Topic--------------------*/

public void deleteTopic(String id) {
topics.removeIf(t -> t.getId().equals(id));
}

}
