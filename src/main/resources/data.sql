insert into users_details(
	firstName,
	lastName,
	emailId,
	mobileNo,
	dob,
	createdDate,
	lastUpdatedDate,
	login_username,
	login_password,
	role,
	isenabled,
	profilePicName)
 values('punyasmruti',
	 'nayak',
	 'punya@gmail.com',
	 '9962428121',
	 sysdate(),
	 sysdate(),
	 sysdate(),
	 'punya',
	 '$2a$10$g5fAs.BoSvFLeTwdRst/GuwWFI7Sr12LX4uBr0s8d2pBgzyMUq68e',
	 'ROLE_USER',
	 1,
	 null);

-- contacts for punya user
insert into contacts_details(contactName,contactEmailId,contactMobileNO,contactDob,isActive,contactPicName,createdDate,lastUpdatedDate,login_username)
values('aswini','asini@gmail.com','12345',sysdate(),1, null, sysdate(),sysdate(),'punya');

insert into contacts_details(contactName,contactEmailId,contactMobileNO,contactDob,isActive,contactPicName,createdDate,lastUpdatedDate,login_username)
values('pankaj','pankaj@gmail.com','123456',sysdate(),1,null, sysdate(),sysdate(),'punya');



insert into users_details(firstName,lastName,emailId,mobileNo,dob,createdDate,lastUpdatedDate,login_username,login_password,role,isenabled,profilePicName)
values('aswini','kumar','aswini@gmail.com','999999',sysdate(),sysdate(),sysdate(),'aswini','$2a$10$g5fAs.BoSvFLeTwdRst/GuwWFI7Sr12LX4uBr0s8d2pBgzyMUq68e','ROLE_ADMIN',1,null);

-- contacts for aswini user
insert into contacts_details(contactName,contactEmailId,contactMobileNO,contactDob,isActive,contactPicName, createdDate,lastUpdatedDate,login_username)
values('Naveen','naveen@gmail.com','123456',sysdate(),1, null, sysdate(),sysdate(),'aswini');


insert into courses_details(courseName,topicName,refUrlText,refUrlVideo) values('Java','Core Java','https://www.google.com','https://www.youtube.com/watch?v=CFD9EFcNZTQ');
insert into courses_details(courseName,topicName,refUrlText,refUrlVideo) values('Java','Advanced Java','https://www.google.com','https://www.youtube.com/watch?v=Ae-r8hsbPUo');
insert into courses_details(courseName,topicName,refUrlText,refUrlVideo) values('Java','Spring Framework','https://www.google.com','https://www.youtube.com/watch?v=f6DHAgL7FWc');
insert into courses_details(courseName,topicName,refUrlText,refUrlVideo) values('Java','Spring boot Framework','https://www.google.com','https://www.youtube.com/watch?v=zTAHY0SLQAg');


insert into users_enrolled_courses_details(login_username,topicName) values('punya','Core Java');
insert into users_enrolled_courses_details(login_username,topicName) values('punya','Advanced Java');


commit;