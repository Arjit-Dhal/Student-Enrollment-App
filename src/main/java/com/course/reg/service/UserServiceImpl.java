package com.course.reg.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.course.reg.dao.UserDao;
import com.course.reg.model.Course;
import com.course.reg.model.UserProfile;
import com.course.reg.model.UserRegistration;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String loginUsername) throws UsernameNotFoundException {
		com.course.reg.model.UserLogin userLogin = userDao.findUserByLoginUsername(loginUsername);
		GrantedAuthority authority = null;
		UserDetails userDetails = null;
		User user = null;
		if (userLogin != null) {
			authority = new SimpleGrantedAuthority(userLogin.getRole());
			user = new User(userLogin.getLoginUsername(), userLogin.getLoginPassword(), Arrays.asList(authority));
			userDetails = (UserDetails) user;
		}
		return userDetails;
	}

	@Override
	public void saveUserRegistration(UserRegistration user) {
		user.setLoginPassword(passwordEncoder.encode(user.getLoginPassword()));

		if (user != null && user.getAdminCode() != null && user.getAdminCode().equals("121")) {
			user.setRole("ROLE_ADMIN");
		} else {
			user.setRole("ROLE_USER");
		}

		userDao.saveUserRegistration(user);
	}

	@Override
	public UserProfile findUserProfileByLoginUsername(String loginUsername) {
		return userDao.findUserProfileByLoginUsername(loginUsername);
	}

	@Override
	public void updateUserProfileByLoginUsername(String loginUsername, UserProfile userProfile) {
		userDao.updateUserProfileByLoginUsername(loginUsername, userProfile);
	}

	@Override
	public void updateProfilePicNameForCurrentLoggedInUser(String fileName, String loginUsername) {
		userDao.updateProfilePicNameForCurrentLoggedInUser(fileName, loginUsername);
	}

	@Override
	public void updateContctPicNameForCurrentLoggedInUsername(String fileName, Long contactId) {
		userDao.updateContactPicNameByContactIdForCurrentLoggedInUser(fileName, contactId);
	}

	@Override
	public List<Course> getAllCourses() {
		List<Course> list = userDao.getAllCourses();
		return list;
	}

	@Override
	public List<Course> getAllEnrolledCoursesByLoginUsername(String loginUsername) {
		return userDao.getAllEnrolledCoursesByLoginUsername(loginUsername);
	}

	@Override
	public String enrollTopicName(String loginusername, String topicName) {
		return userDao.enrollTopicName(loginusername, topicName);
	}

	@Override
	public List<Course> searchAllTopicsByTopicName(String topicName) {
		return userDao.searchAllTopicsByTopicName(topicName);
	}

	@Override
	public String saveCourse(Course course) {
		return userDao.saveCourse(course);
	}

	@Override
	public Course getCourseByTopicName(String topicName) {
		return userDao.getCourseByTopicName(topicName);
	}

	@Override
	public void updateCourse(Course course) {
		userDao.updateCourse(course);
	}
}
