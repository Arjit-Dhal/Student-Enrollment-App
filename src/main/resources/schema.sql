 DROP TABLE IF EXISTS users;
 DROP TABLE IF EXISTS contacts;
 
  CREATE TABLE `users_details` (
  `userId` BIGINT NOT NULL AUTO_INCREMENT,
  `login_username` VARCHAR(50) not null unique,
  `login_password` VARCHAR(500) not null,
   `role` VARCHAR(50) not null,
  `isenabled` int(1) not null,
  `firstName` VARCHAR(50) not null,
  `lastName` VARCHAR(50),
  `emailId` VARCHAR(50) NOT NULL UNIQUE,
  `mobileNo` VARCHAR(50) not null,
  `dob` date,
  `profilePicName`  VARCHAR(500),
  `createdDate` date,
  `lastUpdatedDate` date,
  PRIMARY KEY (`login_username`)); 
  
 CREATE TABLE `contacts_details` (
  `contactId` BIGINT(11) PRIMARY KEY AUTO_INCREMENT,
  `contactName` VARCHAR(50) NOT NULL,
  `contactEmailId` VARCHAR(50),
  `contactMobileNO` VARCHAR(50) NOT NULL,
  `contactDob` VARCHAR(50),
  `isActive` int(1) not null,
  `contactPicName` varchar(255) DEFAULT NULL,
  `createdDate` date,
  `lastUpdatedDate` date,
  `login_username` VARCHAR(50) NOT NULL,
  FOREIGN KEY (login_username) REFERENCES users_details(login_username));
  
  --admin inserts courses_details to this table
   CREATE TABLE `courses_details` (
  `courseId` BIGINT(11) PRIMARY KEY AUTO_INCREMENT,
  `courseName` VARCHAR(50) NOT NULL,
  `topicName` VARCHAR(50),
  `refUrlText` VARCHAR(50) NOT NULL,
  `refUrlVideo` VARCHAR(50)
  );
  
  --user inserts his enrolled courses to this table.
   CREATE TABLE `users_enrolled_courses_details`(
  `login_username` VARCHAR(50) NOT NULL,
  `topicName` VARCHAR(50) NOT NULL
  );
  
  
  
  