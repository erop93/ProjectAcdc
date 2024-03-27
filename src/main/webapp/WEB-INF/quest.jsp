<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="parts/header.jsp" %>
<html>
<head>
    <c:set var="score" value="${sessionScope.get('score')}"/>
    <title>Answering questions</title>
</head>
<body>
<form method="post">
    <p><label>
        <c:choose>
        <c:when test="${score == 0}">
        Ты потерял память. Принять вызов НЛО?
        </c:when>
        <c:when test="${score == 1}">
        Ты принял вызов. Поднимешься на мостик к капитану?
        </c:when>
        <c:when test="${score == 2}">
        Ты поднялся на мостик. Ты кто?
        </c:when>
        <c:otherwise>Поражение</c:otherwise>
        </c:choose></label></p>
    <p><label>
        <input type="radio" name="answer" value="1">
        <c:choose>
            <c:when test="${score == 0}">
                Принять вызов
            </c:when>
            <c:when test="${score == 1}">
                Подняться на мостик
            </c:when>
            <c:when test="${score == 2}">
                Рассказать о себе правду
            </c:when>
            <c:otherwise>Поражение</c:otherwise>
        </c:choose>
    </label></p>
    <p><label>
        <input type="radio" name="answer" value="0">
        <c:choose>
            <c:when test="${score == 0}">
                Отклонить вызов
            </c:when>
            <c:when test="${score == 1}">
                Отказаться подниматься на мостик
            </c:when>
            <c:when test="${score == 2}">
                Солгать о себе
            </c:when>
            <c:otherwise>Поражение</c:otherwise>
        </c:choose>
    </label></p>
    <button type="submit" name="answer" class="button2" value="2">Выбрать ответ</button>

</form>
<%@include file="parts/footer.jsp" %>
</body>
</html>
