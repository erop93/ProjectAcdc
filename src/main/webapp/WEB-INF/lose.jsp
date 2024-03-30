<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@include file="parts/header.jsp" %>
<html>
<head>
    <title>You lost!</title>
    <style>
        <%@include file="styles/loseStyle.css"%>
    </style>
</head>
<body>
<div>
    <h2 style="text-align: center;">Вы проиграли. Хотите начать заново?</h2>
    <img src="images/losepage.jpg" alt="lose" width="800" height="500" style="display: block; margin: 0 auto;">
    <form method="post">
        <button type="submit" name="home" class="button3">Начать заново</button>
    </form>
</div>
<%@include file="parts/footer.jsp" %>
</body>
</html>
