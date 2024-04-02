<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>


<title>Insert title here</title>
</head>
<body>
	<form action="UserRegistrationCtl" method="post"></form>

	<style type="text/css">
.log1 {
	padding-top: 2%;
}

i.css {
	border: 2px solid #8080803b;
	padding: 6px;
	background-color: #ebebe0;
}

.input-group-addon {
	box-shadow: 9px 8px 7px #001a33;
}

.p4 {
	background-image: url('img/user_reg.jpg');
	background-size: 100%;
	padding-top: 6%;
	background-position: center;
	background-attachment: fixed;
}
</style>
</head>
<body class="p4">
	<%@include file="Header.jsp"%>
	<main>
	<form action="UserRegistrationCtl" method="post">

		<div class="row pt-3">
			<!-- Grid column -->
			<div class="col-md-4 mb-4"></div>
			
			<%String firstname = (String) request.getAttribute("firstname");
					String lastname = (String) request.getAttribute("lastname");
					
					String login = (String) request.getAttribute("login");
					String password = (String) request.getAttribute("password");
					
					String dob = (String) request.getAttribute("dob");
					String address = (String) request.getAttribute("address");
					
					
					 %>
			
			<div class="col-md-4 mb-4">
				<div class="card input-group-addon">
					<div class="card-body">

						<h3 class="text-center default-text text-primary pb-2">User
							Registration</h3>
						<!--Body-->
						<div>

							<jsp:useBean id="dto" class="in.com.college.dto.UserDTO"
								scope="request"></jsp:useBean>


							<span class="pl-sm-5"><b>First Name</b> <span
								style="color: red;">*</span></span> </br>
							<div class="col-sm-12">
								<div class="input-group">
									<div class="input-group-prepend">
										<div class="input-group-text">
											<i class="fa fa-user-alt grey-text" style="font-size: 1rem;"></i>
										</div>
									</div>
									<input type="text" class="form-control" name="firstName"
										placeholder="First Name" value="">
								</div>
								<%
										if (firstname != null) {
									%><font color="red" class="pl-sm-5"><%=firstname%></font>
									<%
										}
									%>
							</div>


							<span class="pl-sm-5"><b>Last Name</b> <span
								style="color: red;">*</span></span></br>
							<div class="col-sm-12">
								<div class="input-group">
									<div class="input-group-prepend">
										<div class="input-group-text">
											<i class="fa fa-user-circle grey-text"
												style="font-size: 1rem;"></i>
										</div>
										<%
										if (lastname != null) {
									%><font color="red" class="pl-sm-5"><%=lastname%></font>
									<%
										}
									%>
									</div>
									<input type="text" class="form-control" name="lastName"
										placeholder="Last Name" value="">
								</div>
							</div>


							<span class="pl-sm-5"><b>Password</b> <span
								style="color: red;">*</span></span> </br>
							<div class="col-sm-12">
								<div class="input-group">
									<div class="input-group-prepend">
										<div class="input-group-text">
											<i class="fa fa-key grey-text" style="font-size: 1rem;"></i>
										</div>
									</div>
									<input type="password" class="form-control" name="password"
										placeholder="password" value="">

								</div>
								<%
										if (password != null) {
									%><font color="red" class="pl-sm-5"><%=password%></font>
									<%
										}
									%>
							</div>

							<span class="pl-sm-5"><b>Email Id</b> <span
								style="color: red;">*</span></span> </br>
							<div class="col-sm-12">
								<div class="input-group">
									<div class="input-group-prepend">
										<div class="input-group-text">
											<i class="fa fa-envelope grey-text" style="font-size: 1rem;"></i>
										</div>
										<%
										if (login != null) {
									%><font color="red" class="pl-sm-5"><%=login%></font>
									<%
										}
									%>
									</div>
									<input type="text" class="form-control" id="defaultForm-email"
										name="emailId" placeholder="email Id" value="">

								</div>
							</div>




							<span class="pl-sm-5"><b>DOB</b> <span style="color: red;">*</span></span></br>
							<div class="col-sm-12">
								<div class="input-group">
									<div class="input-group-prepend">
										<div class="input-group-text">
											<i class="fa fa-calendar grey-text" style="font-size: 1rem;"></i>
										</div>
									</div>
									<input type="date" name="dob" class="form-control"
										placeholder="Date Of Birth" value="">
								</div>
								<%
										if (dob != null) {
									%><font color="red" class="pl-sm-5"><%=dob%></font>
									<%
										}
									%>
							</div>


							<div class="text-center">
								<br> <input type="submit" name="operation"
									class="btn btn-success btn-md" style="font-size: 17px"
									value="SignUp"> <input type="submit" name="operation"
									class="btn btn-secondary btn-md" style="font-size: 17px"
									value="OP_RESET">
							</div>
						</div>

					</div>
				</div>
				<div class="col-md-4 mb-4"></div>
			</div>

	</main>

	</div>

	<%@include file="Footer.jsp"%>
	</div>
</form>
</body>
<br>
<br>
	
</html>