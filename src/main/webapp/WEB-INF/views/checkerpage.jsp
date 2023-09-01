<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn"  uri = "http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page import="com.customerapp.model.hibernate.service.formbeans.CustomerFormBean" %>

<html>
<head>
    <meta charset="UTF-8">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.18/css/jquery.dataTables.css"/>
        <script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.js"></script>
        <script>
        $(document).ready( function () {
            $('#myTable').DataTable();
        } );
        </script>

    <title>Customer Management App</title>
</head>

<body>
<c:if test="${user==null}">
    <c:redirect url="/loginpage.jsp?message=Please Login First"/>
</c:if>


<nav class="navbar navbar-dark sticky-top bg-light">
  <div class="container-fluid">
    <h4><spring:message code="makerpage.hello" text="Hello"/>! ${user.name}(${user.role})</h4>
  </div>
</nav>
<br>

&nbsp &nbsp <button type="button" class="btn btn-danger"><a href="/CustMgmtApp/logout" style="text-decoration:none;color:white"><spring:message code="makerpage.logout.button" text="Log Out"/></a></button>

<br>

<br>

<div class="container">
<table id="myTable">
  <thead>
      <tr>
          <th scope="col"><spring:message code="makerpage.th.customercode" text="Customer Code"/></th>
          <th scope="col"><spring:message code="makerpage.th.customername" text="Customer Name"/></th>
          <th scope="col"><spring:message code="makerpage.th.emailaddress" text="Email Address"/></th>
          <th scope="col"><spring:message code="makerpage.th.recordstatus" text="Record Status"/></th>
          <th scope="col"><spring:message code="makerpage.th.createdby" text="Created By"/></th>
          <th scope="col"><spring:message code="makerpage.th.createddate" text="Created Date"/></th>
          <th scope="col"><spring:message code="makerpage.th.modifiedby" text="Mod-By"/></th>
          <th scope="col"><spring:message code="makerpage.th.modifieddate" text="Mod-Date"/></th>
          <th scope="col"><spring:message code="makerpage.th.authorizedby" text="Auth-By"/></th>
          <th scope="col"><spring:message code="makerpage.th.authorizeddate" text="Auth-Date"/></th>
          <th scope="col"><spring:message code="makerpage.th.actions" text="Actions"/></th>

        </tr>
    </thead>
    <tbody>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td scope="col">${customer.customerCode}</td>
            <td scope="col">${customer.customerName}</td>
            <td scope="col">${customer.emailAddress}</td>
            <td scope="col">${customer.recordStatus}</td>
            <td scope="col">${customer.createdBy}</td>
            <td scope="col">${customer.createdDate}</td>
            <td scope="col">${customer.modifiedBy}</td>
            <td scope="col">${customer.modifiedDate}</td>
            <td scope="col">${customer.authorizedBy}</td>
            <td scope="col">${customer.authorizedDate}</td>

            <td>
            <button type="button" class="btn btn-primary btn-sm" ><a href="approve?id=<c:out value="${customer.customerCode}"/>" class="delete"  style="text-decoration:none;color:white"><spring:message code="checkerpage.approve.button" text="Approve"/></a></button>
            <button type="button" class="btn btn-danger btn-sm" ><a href="reject?id=<c:out value="${customer.customerCode}"/>" class="delete" style="text-decoration:none;color:white"><spring:message code="checkerpage.reject.button" text="Reject"/></a></button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>


</body>
</html>