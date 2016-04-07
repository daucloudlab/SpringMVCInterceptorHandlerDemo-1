<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hi page</title>
</head>
<body>

<em>
  Welcome!
  <c:out value="${greeting}"></c:out>
  <c:out value="${special}"></c:out>
</em>
<hr />
<h1>
  <c:out value="${message}"></c:out>
</h1>

<h2><a href="/animalList">Animal List</a></h2>

</body>
</html>
