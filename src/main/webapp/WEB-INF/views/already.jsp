<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Already</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

</head>
<body>
<h1>  &nbsp &nbsp  OOPSIEEEE ! </h1>
&nbsp &nbsp <h1>Customer With This Customer Code Already Exists!<br> &nbsp &nbsp Either Try To Update Existing One or Try With New Customer Code</h1>
&nbsp <button type="button" class="btn btn-primary btn-sm"><a href="addcustomer" style="text-decoration:none;color:white"><spring:message code="makerpage.addcustomer.button" text="Add New Customer"/></a></button>
<button type="button" class="btn btn-primary btn-sm"><a href="update?id=${customerCode}&status=${recordStatus}" class="delete"  style="text-decoration:none;color:white"><spring:message code="makerpage.update.button" text="update"/></a></button>

&nbsp <button type="button" class="btn btn-secondary"><a href="home" style="text-decoration:none;color:white"><spring:message code="home.button" text="update"/></a></button>


</body>
</html>