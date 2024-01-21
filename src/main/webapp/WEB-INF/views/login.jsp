<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Log in with your account</title>
    <%-- <script src="${contextPath}/static/lib/css/bootstrap.min.css"></script>  --%>
	<!-- <link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"> -->
    <%-- <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet"> --%>
    <%-- <link href="${contextPath}/resources/css/common.css" rel="stylesheet"> --%>
</head>

<body>

<div class="container">
		<form method="POST" action="${contextPath}/login" class="form-signin">
			
			<div class="form-group ${error != null ? 'has-error' : ''}">
				<span>${message}</span>
				Username:<input name="username" type="text" class="form-control" placeholder="Username" autofocus />
				Password:<input name="password" type="password" class="form-control" placeholder="Password" />
				<span>${error}</span>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<button class="btn btn-lg btn-primary btn-block" type="submit">LogIn</button>
			</div>
		</form>
	</div>
<%-- 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
--%>
<%-- <script src="${contextPath}/static/lib/js/jquery-1.2.6.js"></script> 
<script src="${contextPath}/static/lib/js/bootstrap.min.js"></script>  --%>
<!-- <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script> -->
</body>
</html>