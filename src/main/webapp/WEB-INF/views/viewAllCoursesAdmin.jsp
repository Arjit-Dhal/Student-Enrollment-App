<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>

<title>All Courses</title>
<style type="text/css">

* {
	margin: 0px;
	padding: 0px;
}

/*####################################################################################################
	header section
    ####################################################################################################*/
    
header {
	margin: auto;
	/* border: 2px solid red; */
	background-color: #5d2e2e;
	height: 115px;
	/* border-radius: 10px; */
}

img {
	margin: auto;
	padding: 5px;
	display: block;
	width: 70px;
	border-radius: 40px;
}

h1 {
	text-align: center;
	margin-top: 0px;
	color: white;
	padding-top: 25px;
	padding-bottom: 20px;
	text-decoration: underline;
}

.navbar {
	background-color: orange;
	//padding-top: 10px;
	/* border-radius: 10px; */
	/* border: 2px solid red; */
}

.navbar ul {
	overflow: auto;
	margin-top: 50px;
}

.navbar li {
	float: right;
	list-style: none;
	margin: 5px 10px;
}

.navbar li a {
	color: white;
	padding: 3px 30px;
	text-decoration: none;
}

.navbar li a:hover {
	color: orange
}

/*######################################################################################################
main or body content
######################################################################################################*/
main {
	width: 100%;
	height: 70.3vh;
	/* background-image: linear-gradient(rgba(0, 0, 0, 0.2), rgba(0, 0, 0, 0.4)),url('images/images.jpg');
	background-repeat: no-repeat;
	background-size: cover; */
	background-color:lightblue;
	display: flex;
	justify-content: center;
	align-items: center;
	text-align: center;
	color: black;
}

/* span {
	background-color: blue;
}
 */
section h3 {
	font-size: 35px;
	font-weight: 200;
	letter-spacing: 3px;
}

section h1 {
	margin: 10px 0 10px 0;
	font-size: 45px;
	font-weight: 700;
	text-shadow: 2px 1px 5px black;
	text-transform: uppercase;
}

section p {
	font-size: 25px;
	word-spacing: 2px;
	margin-bottom: 10px;
	text-shadow: 1px 1px 1px black;
}

section a {
	padding: 12px 30px;
	border-radius: 4px;
	outline: none;
	/*text-transform: uppercase;*/
	font-size: 13px;
	font-weight: 500;
	text-decoration: none;
	letter-spacing: 1px;
	color: blue;
}

section .btn_login {
	background: orange;
}

section .btn_signup {
	background: orange;
}

.errormsg {
	color: red;
	font-style: bold;
}
/*main or body section endened */

/*####################################################################################################
	footer section
####################################################################################################*/
footer {
	width: 100%;
	height: 5vh;
	background-image: linear-gradient(rgba(0, 0, 0, 0.3), rgba(0, 0, 0, 0.1)),url('../images/showcase.jpg');
	background-repeat: no-repeat;
	background-size: cover;
	background-color: #5d2e2e;
	text-align: center;
	padding-top: 5px;
}

footer a {
	font-size: 15px;
	font-weight: 500;
	text-decoration: none;
	letter-spacing: 1px;
	color: white;
}
</style>
</head>
<body>
<!-- ######################################## Header  content  ################################## -->
	<header>
		<!-- <img src="static/images/punya.PNG" alt="photo"> -->
		<h1>Welcome To Course Registration APP</h1>
		<nav class="navbar">
			<ul>
				<li><a href="${pageContext.request.contextPath}/view/profile">My Profile</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<br>
 	<h2 align="center">Welcome ${pageContext.request.userPrincipal.name} |  <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>
	 <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    </c:if>
    <!-- ######################################## Body  content  ################################## -->
	<main>
	<section>
		<a class="button" href="${pageContext.request.contextPath}/course/form"><h3><u>To Add a New Course , click here</u></h3></a>
		<form action="<c:url value="/admin/search/topic"/>">
			Search By Topic Name:<input type="text" name="topic" placeholder="Enter Topic name"/>
			<button>Search</button>
		</form >
		
		<center>${enroll}</center>
		
		<H1>All Courses</H1>
		<table border="1">
			<thead>
				<tr>
					<th>Course Name</th>
					<th>Topic Name</th>
					<th>Ref Url Text</th>
					<th>Ref Url Video</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${courseList}" var="course">
					<tr>
						<td align="center">${course.courseName}</td>
						<td align="center">${course.topicName}</td>
						<td align="center">${course.refUrlText}</td>
						<td align="center">${course.refUrlVideo}</td>
						<td align="center">
						<a href="${pageContext.request.contextPath}/edit/courseForm/${course.topicName}" type="button" >Edit</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
	</main>
	<!-- ######################################## footer content ########################################-->
	<footer>
		<a href="#">copy_write@punya_blog_spot</a>
	</footer>
</body>
</html>