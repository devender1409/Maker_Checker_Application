<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<title><spring:message code="updatecustomerpage.title" text="Update Customer"/></title>
</head>
<body>
<c:if test="${user==null}">
    <c:redirect url="/"/>
</c:if>
<h1><spring:message code="updatecustomerpage.title" text="Update Customer"/></h1>
<hr>
<br>
<form:form action="update" method="post" modelAttribute="customer">
    <form:hidden path="customerId"/>
    <form:hidden path="recordStatus"/>
	&nbsp <spring:message code="makerpage.th.customercode" text="Customer Code"/> : <form:input path="customerCode" readonly="true"/> <br><br>
	&nbsp <spring:message code="makerpage.th.customername" text="Customer Name"/> : <form:input path="customerName"/> <br><br>
	&nbsp <spring:message code="makerpage.th.address1" text="Adress1"/> : <form:input path="customerAddress1"/> <br><br>
	&nbsp <spring:message code="makerpage.th.address2" text="Adress2"/> : <form:input path="customerAddress2"/> <br><br>
	&nbsp <spring:message code="makerpage.th.pincode" text="Pin Code"/> : <form:input path="customerPinCode"/> <br><br>
    &nbsp <spring:message code="makerpage.th.emailaddress" text="Email Address"/> : <form:input path="emailAddress"/> <br><br>
    &nbsp <spring:message code="makerpage.th.contact" text="Contact Number"/> : <form:input path="contactNumber"/> <br><br>
    &nbsp <spring:message code="makerpage.th.primaryContactPerson" text="Primary Contact Person"/> : <form:input path="primaryContactPerson"/> <br>
    &nbsp <spring:message code="makerpage.customertype" text="Customer Type"/> <br>

    	<form:radiobutton path="activeInactiveFlag" value="A"/> :ACTIVE
    	<form:radiobutton path="activeInactiveFlag" value="I"/> :INACTIVE
    	<br>
    	<br>

	&nbsp &nbsp &nbsp <button type="submit" class="btn btn-primary"><spring:message code="updatecustomerpage.title" text="Update Customer"/></button> &nbsp &nbsp
    <button type="reset" class="btn btn-secondary"><spring:message code="addcustomerpage.reset.button" text="Reset"/></button>

</form:form>
</body>
</html>