<%@page import="in.com.college.controller.ORSView"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/demos/style.css">
<style>
body {
	background-image: url('<%=ORSView.APP_CONTEXT%>/img/imagess.jpg');
	background-size: cover;
	background-repeat: no-repeat;
}

.cl {
	/* font-family:;
	font-family: Monotype Corsiva;
	font-family: Footlight MT Light;
 */
	
}
</style>

</head>
<body class="img-fluid">
	<div class="header">
		<%@include file="Header.jsp"%>
	</div>
	<div class="text-cs1" >
		 scrollamount="15" behavior="alternate">
			<h1 style="padding-top: 19%; color: pink;  text-align: center;">
				<b class="cl">Welcome To Online Result System</b>
			</h1>
		
		<%
		System.out.println("WelcomeView");
			UserDTO beanUserBean = (UserDTO) session.getAttribute("user");
			if (beanUserBean != null) {
				if (beanUserBean.getRoleId() == RoleDTO.STUDENT) {
		%>

		<h2 align="Center">
			<a href="<%=ORSView.GET_MARKSHEET_CTL%>">Click here to see your
				Marksheet </a>
		</h2>

		<%
			}
			}
		%>
		
	</div>
	<div class="footer">
		<%@include file="FooterView.jsp"%>
	</div>
</body>

</html>