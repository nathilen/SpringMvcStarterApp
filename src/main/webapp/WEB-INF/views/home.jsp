<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=utf-8 />
<title>Home page</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/styles.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h1>Welcome to the home page</h1>
		</div>
		<div id="info">
			<p>User Local : ${userLocal}</p>
			<p>User HTTP Call : ${httpCall}</p>
			<p>Server time : ${serverTime}</p>
			<p>Context path : ${contextPath}</p>
		</div>
	</div>
</body>
</html>
