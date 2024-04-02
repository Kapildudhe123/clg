<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login view</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>


<style type="text/css">
.log1 {
	padding-top: 9%;
}

.input-group-addon {
	box-shadow: 9px 8px 7px #001a33;
}

.grad {
	background-image: linear-gradient(to bottom right, grey, white);
	background-repeat: no repeat;
	background-size: 100%;
	padding-bottom: 11px;
}

i.css {
	border: 2px solid #8080803b;
	padding-left: 10px;
	background-color: #ebebe0;
}

.p4 {
	background-image: url('img/login_img.jpg');
	background-size: cover;
	background-repeat: no repeat;
	class
	=
	"img-responsive";
}
</style>
</head>
<body class="p4">
	<div>
		<%@include file="Header.jsp"%>
	</div>
	<jsp:useBean id="dto" class="in.com.college.dto.UserDTO"
		scope="request"></jsp:useBean>
	<div>

		<main>
		<form action="LoginCtl" method="post">

			<div class="row log1">

				<div class="col-md-4 "></div>

				<%
					String login = (String) request.getAttribute("login");
					String password = (String) request.getAttribute("password");
					String msg = (String) request.getAttribute("msg");
					String logout = (String) request.getAttribute("logout");
				%>
				<div class="col-md-4">
					<div class="card input-group-addon grad	">
						<div class="card-body">


							<h3 class="text-center text-dark">Login</h3>
							<%
								if (msg != null) {
							%><font color="red"><%=msg%></font>
							<%
								}
							%>
							<%
								if (logout != null) {
							%><font color="red"><%=logout%></font>
							<%
								}
							%>

							<div>

								<span class="pl-sm-5"><b>Email Id</b> <span
									style="color: red;">*</span></span> </br>

								<div class="col-sm-12">
									<div class="input-group">
										<div class="input-group-prepend">
											<div class="input-group-text">
												<i class="fa fa-envelope grey-text" style="font-size: 1rem;"></i>
											</div>
										</div>
										<input type="text" class="form-control input-group-addon"
											name="loginId" placeholder="Enter email" value="">
									</div>
									<%
										if (login != null) {
									%><font color="red" class="pl-sm-5"><%=login%></font>
									<%
										}
									%>
								</div>

								<font color="red" class="pl-sm-5"> </font></br> <span class="pl-sm-5"><b>Password</b>
									<span style="color: red;">*</span></span> </br>
								<div class="col-sm-12">
									<div class="input-group">
										<div class="input-group-prepend">
											<div class="input-group-text">
												<i class="fa fa-lock grey-text" style="font-size: 1rem;"></i>
											</div>
										</div>
										<div></div>
										<input type="password" id="myInput"
											class="form-control input-group-addon" name="password"
											placeholder="Enter password" value="">
									</div>
									<%
										if (password != null) {
									%><font color="red" class="pl-sm-5"><%=password%></font>
									<%
										}
									%>
									<br>
									<div class="text-center">

										<input type="submit" name="operation"
											class="btn btn-success btn-md hover-overlayed"
											style="font-size: 17px" value="SignIn"> <input
											type="submit" name="operation" class="btn btn-primary btn-md"
											style="font-size: 17px" value="SignUp">
									</div>
					</div>
				</div>
			</div>
			<div class="col-md-4 "></div>
			</form>
</body>
<%@include file="Footer.jsp"%>

</html>