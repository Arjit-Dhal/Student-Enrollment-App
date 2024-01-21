package com.course.reg.model;

public class Course {

	private Integer Id;
	private String courseName;
	private String topicName;
	private String refUrlText;
	private String refUrlVideo;

	public Course() {
	}

	public Course(Integer id, String courseName, String topicName, String refUrlText, String refUrlVideo) {
		super();
		Id = id;
		this.courseName = courseName;
		this.topicName = topicName;
		this.refUrlText = refUrlText;
		this.refUrlVideo = refUrlVideo;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getRefUrlText() {
		return refUrlText;
	}

	public void setRefUrlText(String refUrlText) {
		this.refUrlText = refUrlText;
	}

	public String getRefUrlVideo() {
		return refUrlVideo;
	}

	public void setRefUrlVideo(String refUrlVideo) {
		this.refUrlVideo = refUrlVideo;
	}

	@Override
	public String toString() {
		return "Course [Id=" + Id + ", courseName=" + courseName + ", topicName=" + topicName + ", refUrlText="
				+ refUrlText + ", refUrlVideo=" + refUrlVideo + "]";
	}

}
