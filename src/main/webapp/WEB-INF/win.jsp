<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@include file="parts/header.jsp" %>
<html>
<head>
    <title>Victory!</title>
</head>
<body>

<div>
    <h1>You did it</h1>
    <form method="post">
        <button type="submit" name="home" class="button3">Начать заново</button>
    </form>
</div>
<%@include file="parts/footer.jsp" %>
</body>
</html>
