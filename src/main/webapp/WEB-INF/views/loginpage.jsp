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
<nav class="navbar navbar-dark sticky-top bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="loginpage.jsp">CMA</a>
    <h3>
  </div>
</nav>


<form action="login" method="post">
    <section class="vh-100 gradient-custom">
      <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col-12 col-md-8 col-lg-6 col-xl-5">
            <div class="card bg-dark text-white" style="border-radius: 1rem;">
              <div class="card-body p-5 text-center">

                <div class="mb-md-5 mt-md-4 pb-5">

                  <h2 class="fw-bold mb-2 text-uppercase"><spring:message code="loginpage.title" text="Login"/></h2>
                    <strong><p class="text-white-50 mb-5">${param.message}</p><strong>
                    <strong><p class="text-white-50 mb-5">${param.error}</p><strong>
                  <div class="form-outline form-white mb-4">
                    <input type="text" id="typeEmailX" class="form-control form-control-lg" name="email" maxlength=35 required="true"/>
                    <label class="form-label" for="typeEmailX"><spring:message code="loginpage.email.msg" text="Enter Email"/></label>
                  </div>

                  <div class="form-outline form-white mb-4">
                    <input type="password" id="typePasswordX" class="form-control form-control-lg"  name="password" required="true"/>
                    <label class="form-label" for="typePasswordX"><spring:message code="loginpage.password.msg" text="Enter Password"/></label>
                  </div>

                  <button class="btn btn-outline-light btn-lg px-5" type="submit"><spring:message code="loginpage.loginbutton" text="Login"/></button>
                </div>

              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

</form>
</body>
</html>