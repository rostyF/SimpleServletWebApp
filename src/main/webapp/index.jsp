<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<br/>
<h1>Какой рукой Вы пишете? </h1>
<br/>
<form action="hello-servlet" method="POST">
    <label>
        <input type="radio" name="question" value="right">
        Правша
    </label>
    <br>
    <label>
        <input type="radio" name="question" value="left">
        Левша
    </label>
    <input type="submit" />
</form>
</body>
</html>