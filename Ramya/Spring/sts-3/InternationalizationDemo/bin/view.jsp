
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<body>
<h1>CandidJava Spring MVC Internationalization Example</h1>
Language : <a href="?language=en">English</a>| <a href="?language=zh_CN">Chinese</a>
<h3> welcome.springmvc :
  <spring:message code="welcome.springmvc" text="default text" />
</h3>
Current Locale : ${pageContext.response.locale}
</body>
</html>
