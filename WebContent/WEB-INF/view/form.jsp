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
<form:form commandName="command" cssClass="form-lable">
<div>
<h3>과목</h3>

<form:radiobutton path="subject" value="ws" label="데이터베이스 개론(03)" />
<form:radiobutton path="subject" value="ssd" label="데이터베이스 프로그래밍" />

<br>
<h3>코드</h3>
<form:input path="code" cssClass="form-lable" /><font style="color: RED;">${message}</font>
</div>
<br><br>
<input type="submit" value="Search" />
</form:form>
</body>
</html>