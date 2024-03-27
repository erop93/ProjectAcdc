<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@include file="parts/header.jsp" %>
<html>
<head>
    <title>You lost!</title>
</head>
<body>
<div>
    <h2>Вы проиграли. Хотите начать заново?</h2>
    <form method="post">
        <button type="submit" name="home" class="button3">Начать заново</button>
    </form>
</div>
<%@include file="parts/footer.jsp" %>
</body>
</html>
