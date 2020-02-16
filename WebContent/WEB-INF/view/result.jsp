<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Score Search</title>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 20px;	
}
</style>
<script lang="javascript">
function distribution(aa) {     
 	if (aa == "ws") {
 		document.getElementById("distr").innerHTML = "<img src='ws.JPG' />";
 	}
 	else {
 		document.getElementById("distr").innerHTML = "<img src='ssd.JPG' />";
 	}
};
</script>
</head>
<body>
<h3>
<c:if test="${command.subject eq 'ws'}">데이터베이스 개론(03)</c:if> 
<c:if test="${command.subject eq 'ssd'}">데이터베이스 프로그래밍</c:if>
(중간고사)</h3>
<ul>
<li>코드: ${command.code}</li>
<li>점수: ${command.score}</li>
</ul>
<div id="${command.subject}" onClick="distribution('${command.subject}')"><a href="#">성적분포</a></div>
<br><div id="distr"></div>
</body>
</html>