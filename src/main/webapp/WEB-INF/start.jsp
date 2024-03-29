<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="parts/header.jsp" %>
<html>
<head>
    <title>Alien quest</title>
    <style>
        <%@include file="styles/startStyle.css"%>
    </style>
</head>
<body>
<p1>Ты стоишь в космическом порту и готов подняться на борт своего корабля. Разве ты не об этом мечтал?
Стать капитаном галактического судна с экипажем, который будет совершать подвиги под твоим командованием.
Так что вперед!</p1>
<p></p>
<img src="images/startpage.png" alt="starshipEntrance">

<h1>Знакомство с экипажем</h1>
<p2>Когда ты поднялся на борт корабля, тебя поприветствовала девушка с черной папкой в руках: -Здравствуйте, командир! Я Зинаида - Ваша помощница. Видите? Там в углу пьет кофе наш штурман -
сержант Перегарный Шлей, под штурвалом спит наш бортмеханик - Черный Богдан, а фотографирует его
Сергей Стальная Пятка, наш навигатор.</p2>
<br>
<p3>А как обращаться к Вам?</p3>


    <form method="post">
        <label>
            <input id="inputName" type="text" alt="Представьтесь" name="name">
        </label>
        <button type="submit" id="button1">Приступим!</button>
    </form>

<%@include file="parts/footer.jsp" %>
</body>
</html>
