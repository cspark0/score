<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Score Search</title>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}
.form-lable {
  font-size: 20px;
}
</style>
</head>
<body>
<form:form commandName="command" cssClass="form-lable" action="hakbun">
<div>
<h3>중복된 코드가 있습니다. 학번을 입력하세요.</h3>
<form:input path="hakbun" cssClass="form-lable" /><font style="color: RED;">${message}</font>
</div>
<br><br>
<input type="submit" value="Search" />
</form:form>
</body>
</html>