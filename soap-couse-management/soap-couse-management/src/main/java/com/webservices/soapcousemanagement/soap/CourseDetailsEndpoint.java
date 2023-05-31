package com.webservices.soapcousemanagement.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.GetCourseDetailsRequest;
import com.in28minutes.courses.GetCourseDetailsResponse;


@Endpoint
public class CourseDetailsEndpoint {
@PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "GetCourseDetailsRequest")
	public GetCourseDetailsResponse 
	processCourseDetailsRequets(@RequestPayload GetCourseDetailsRequest request) {
	
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(request.getId());
		courseDetails.setName("MicroService");
		courseDetails.setDescription("Wonderful Course");
		response.setCourseDetails(courseDetails);
		return response;
	} 
}
