<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@include file="parts/header.jsp" %>
<html>
<head>
    <title>Victory!</title>
    <style>
        <%@include file="styles/winStyle.css"%>
    </style>
</head>
<body>

<div>
    <h1 style="text-align: center;">You did it</h1>
    <img src="images/winpage.jpg" alt="victory" width="800" height="500" style="display: block; margin: 0 auto;">
    <form method="post">
        <button type="submit" name="home" class="button3">Начать заново</button>
    </form>
</div>
<%@include file="parts/footer.jsp" %>
</body>
</html>
