<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Alien quest</title>
</head>
<body>
<h1>Пролог</h1>
<p>Ты стоишь в космическом порту и готов подняться на борт своего корабля. Разве ты не об этом мечтал?
Стать капитаном галактического судна с экипажем, который будет совершать подвиги под твоим командованием.
Так что вперед!</p>

<h1>Знакомство с экипажем</h1>
<p>Когда ты поднялся на борт корабля, тебя поприветствовала девушка с черной папкой в руках:
-Здравствуйте, командир! Я Зинаида - Ваша помощница. Видите? Там в углу пьет кофе наш штурман -
сержант Перегарный Шлей, под штурвалом спит наш бортмеханик - Черный Богдан, а фотографирует его
Сергей Стальная Пятка  наш навигатор.
А как обращаться к Вам?</p>
<p>А как обращаться к Вам?</p>

<div class="beginForm">
    <form class="form-horizontal">
        <fieldset>

            <!-- Form Name -->
            <legend>Form Name</legend>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="textinput">Представиться</label>
                <div class="col-md-4">
                    <input id="textinput" name="textinput" type="text" placeholder="Spaceship captain" class="form-control input-md">
                    <span class="help-block">your name</span>
                </div>
            </div>

            <!-- Button -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="startQuestButton">В путь</label>
                <div class="col-md-4">
                    <button id="startQuestButton" name="startQuestButton" class="btn btn-primary">START</button>
                </div>
            </div>

        </fieldset>
    </form>

</div>
</body>
</html>
