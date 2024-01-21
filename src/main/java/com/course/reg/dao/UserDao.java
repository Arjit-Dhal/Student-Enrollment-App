package com.course.reg.dao;

import java.util.List;

import com.course.reg.model.Course;
import com.course.reg.model.UserLogin;
import com.course.reg.model.UserProfile;
import com.course.reg.model.UserRegistration;

public interface UserDao {
	
	public void saveUserRegistration(UserRegistration userRegistration);
	public UserProfile findUserProfileByLoginUsername(String loginUsername);
	public void updateUserProfileByLoginUsername(String loginUsername,UserProfile userProfile);
	public UserLogin findUserByLoginUsername(String loginUsername);
	public void updateProfilePicNameForCurrentLoggedInUser(String profilePicfileName, String loginUsername);
	public void updateContactPicNameByContactIdForCurrentLoggedInUser(String contactPicfileName, Long contactId) ;
	public List<Course> getAllCourses();
	public List<Course> getAllEnrolledCoursesByLoginUsername(String loginUsername);
	public String enrollTopicName(String loginusername,String topicName);
	public List<Course> searchAllTopicsByTopicName(String topicName);
	public String saveCourse(Course course);
	public Course getCourseByTopicName(String topicName);
	public void updateCourse(Course course);
	
}
