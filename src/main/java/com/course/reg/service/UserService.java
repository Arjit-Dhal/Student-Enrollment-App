package com.course.reg.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.course.reg.model.Course;
import com.course.reg.model.UserProfile;
import com.course.reg.model.UserRegistration;


public interface UserService extends UserDetailsService{
	
	public void saveUserRegistration(UserRegistration user);
	public UserProfile findUserProfileByLoginUsername(String loginUsername);
	public void updateUserProfileByLoginUsername(String loginUsername,UserProfile userProfile);
	public void updateProfilePicNameForCurrentLoggedInUser(String profilePicfileName, String loginUsername);
	public void updateContctPicNameForCurrentLoggedInUsername(String contactPicfileName, Long contactId);
	public List<Course> getAllEnrolledCoursesByLoginUsername(String loginUsername);
	public List<Course> getAllCourses();
	public String enrollTopicName(String loginusername,String topicName);
	public List<Course> searchAllTopicsByTopicName(String topicName);
	public String saveCourse(Course course);
	public Course getCourseByTopicName(String topicName);
	public void updateCourse(Course course);
}
