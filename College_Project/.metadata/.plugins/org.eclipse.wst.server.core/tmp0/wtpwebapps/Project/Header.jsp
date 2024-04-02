<%@page import="in.com.college.dto.UserDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Header</title>
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

</head>
<body>


	<div class="header">
		<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
			<%
				UserDTO user = (UserDTO) session.getAttribute("user");
			
				boolean userLoggedIn = user != null;
			%>
			<a class="navbar-brand" href="WelcomeCtl"><img src="./img/custom.png"
				width="190px" height="50px"></a>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<!-- Add your other menu items here -->
				</ul>

				<%
					if (userLoggedIn) {
				%>
				<ul class="navbar-nav ml-auto">
				<li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Marksheet
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown2">
            <a class="dropdown-item" href="#"><i class="far fa-file"></i> Add marksheet</a>
            <a class="dropdown-item" href="#"><i class="fas fa-paste"></i> Marksheet list</a>
        </div>
    </li><br>
    <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            Hi, <%=user.getFirstName()%>
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="LoginCtl?operation=logout"><i class="fas fa-sign-out-alt"></i> Logout</a>
        </div>
    </li>
    
</ul>
				
				<%
					} else {
				%>
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="LoginCtl"><i
							class="fas fa-sign-in-alt"></i> Login</a></li>
					<li class="nav-item"><a class="nav-link"
						href="UserRegistrationCtl"><i class="fas fa-registered"></i>
							User Registration</a></li>
				</ul>
				<%
					}
				%>
			</div>
		</nav>
	</div>



</body>
</html>
