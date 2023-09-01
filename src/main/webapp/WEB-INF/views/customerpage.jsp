<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <title>CMA</title>
</head>
<body>
<c:if test="${user==null}">
    <c:redirect url="/"/>
</c:if>

<nav class="navbar navbar-dark sticky-top bg-light">
  <div class="container-fluid">
    <h4><spring:message code="makerpage.hello" text="Hello"/>! ${user.name}(${user.role})</h4>
  </div>
</nav>
<h1><spring:message code="customerpage.title" text="Customer Details"/></h1>
<hr>
<br>
<spring:message code="customer Id" text="Customer id"/>: ${customer.customerId}<br>
<spring:message code="makerpage.th.customercode" text="Customer Code"/> : ${customer.customerCode}<br>
<spring:message code="makerpage.th.customername" text="Customer Name"/> : ${customer.customerName}<br>
<spring:message code="makerpage.th.address1" text="Adress1"/> :${customer.customerAddress1}<br>
<spring:message code="makerpage.th.address2" text="Adress1"/>  :${customer.customerAddress2}<br>
<spring:message code="makerpage.th.pincode" text="Pin Code"/>: ${customer.customerPinCode}<br>
<spring:message code="makerpage.th.emailaddress" text="Email Address"/>: ${customer.emailAddress}<br>
<spring:message code="makerpage.th.contact" text="Contact Number"/> : ${customer.contactNumber}<br>
<spring:message code="makerpage.th.primaryContactPerson" text="Primary Contact Person"/> : ${customer.primaryContactPerson}<br>
<spring:message code="makerpage.th.recordstatus" text="Record Status"/>: ${customer.recordStatus}<br>
<spring:message code="makerpage.th.createdby" text="Created By"/>: ${customer.createdBy}<br>
<spring:message code="makerpage.th.createddate" text="Created Date"/>:${customer.createdDate}<br>
<spring:message code="makerpage.th.modifiedby" text="Mod-By"/>: ${customer.modifiedBy}<br>
<spring:message code="makerpage.th.modifieddate" text="Mod-Date"/>:${customer.modifiedDate}<br>
<spring:message code="makerpage.th.authorizedby" text="Auth-By"/>: ${customer.authorizedBy}<br>
<spring:message code="makerpage.th.authorizeddate" text="Auth-Date"/> : ${customer.authorizedDate}<br>
<form:hidden path="createdBy"/>
<form:hidden path="createdDate"/>
<form:hidden path="modifiedBy"/>
<form:hidden path="modifiedDate"/>
<form:hidden path="authorizedBy"/>
<form:hidden path="authorizedDate"/>

            <br>
            <hr>

</form>
</body>
</html>