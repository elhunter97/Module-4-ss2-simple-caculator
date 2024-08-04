<%--
  Created by IntelliJ IDEA.
  User: WINDOWS
  Date: 8/4/2024
  Time: 5:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>

<form method="post">
    <input type="text" name="num1">
    <input type="text" name="num2"><br>
    <button type="submit" name="operator" value="+">+</button>
    <button type="submit" name="operator" value="-">-</button>
    <button type="submit" name="operator" value="*">*</button>
    <button type="submit" name="operator" value="/">/</button>
</form>
<p>Result Division: ${result}</p>
</body>
</html>
