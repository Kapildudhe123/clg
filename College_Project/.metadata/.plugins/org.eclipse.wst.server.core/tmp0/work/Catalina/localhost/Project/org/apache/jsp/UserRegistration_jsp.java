/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2024-03-02 18:13:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.com.college.dto.UserDTO;

public final class UserRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/Header.jsp", Long.valueOf(1709395843619L));
    _jspx_dependants.put("/Footer.jsp", Long.valueOf(1709237994322L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.com.college.dto.UserDTO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\"\r\n");
      out.write("	integrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<form action=\"UserRegistrationCtl\" method=\"post\"></form>\r\n");
      out.write("\r\n");
      out.write("	<style type=\"text/css\">\r\n");
      out.write(".log1 {\r\n");
      out.write("	padding-top: 2%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("i.css {\r\n");
      out.write("	border: 2px solid #8080803b;\r\n");
      out.write("	padding: 6px;\r\n");
      out.write("	background-color: #ebebe0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-group-addon {\r\n");
      out.write("	box-shadow: 9px 8px 7px #001a33;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".p4 {\r\n");
      out.write("	background-image: url('img/user_reg.jpg');\r\n");
      out.write("	background-size: 100%;\r\n");
      out.write("	padding-top: 6%;\r\n");
      out.write("	background-position: center;\r\n");
      out.write("	background-attachment: fixed;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"p4\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Header</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\"\r\n");
      out.write("	integrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"header\">\r\n");
      out.write("		<nav class=\"navbar navbar-expand-lg navbar-light bg-light fixed-top\">\r\n");
      out.write("			");

				UserDTO user = (UserDTO) session.getAttribute("user");
			
				boolean userLoggedIn = user != null;
			
      out.write("\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"WelcomeCtl\"><img src=\"./img/custom.png\"\r\n");
      out.write("				width=\"190px\" height=\"50px\"></a>\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("				<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("					<!-- Add your other menu items here -->\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("				");

					if (userLoggedIn) {
				
      out.write("\r\n");
      out.write("				<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("				<li class=\"nav-item dropdown\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown2\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("            Marksheet\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown2\">\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\"><i class=\"far fa-file\"></i> Add marksheet</a>\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-paste\"></i> Marksheet list</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </li><br>\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("            Hi, ");
      out.print(user.getFirstName());
      out.write("\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"LoginCtl?operation=logout\"><i class=\"fas fa-sign-out-alt\"></i> Logout</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    \r\n");
      out.write("</ul>\r\n");
      out.write("				\r\n");
      out.write("				");

					} else {
				
      out.write("\r\n");
      out.write("				<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"LoginCtl\"><i\r\n");
      out.write("							class=\"fas fa-sign-in-alt\"></i> Login</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"UserRegistrationCtl\"><i class=\"fas fa-registered\"></i>\r\n");
      out.write("							User Registration</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				");

					}
				
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("	<main>\r\n");
      out.write("	<form action=\"UserRegistrationCtl\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row pt-3\">\r\n");
      out.write("			<!-- Grid column -->\r\n");
      out.write("			<div class=\"col-md-4 mb-4\"></div>\r\n");
      out.write("			\r\n");
      out.write("			");
String firstname = (String) request.getAttribute("firstname");
					String lastname = (String) request.getAttribute("lastname");
					
					String login = (String) request.getAttribute("login");
					String password = (String) request.getAttribute("password");
					
					String dob = (String) request.getAttribute("dob");
					String address = (String) request.getAttribute("address");
					
					
					 
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"col-md-4 mb-4\">\r\n");
      out.write("				<div class=\"card input-group-addon\">\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("						<h3 class=\"text-center default-text text-primary pb-2\">User\r\n");
      out.write("							Registration</h3>\r\n");
      out.write("						<!--Body-->\r\n");
      out.write("						<div>\r\n");
      out.write("\r\n");
      out.write("							");
      in.com.college.dto.UserDTO dto = null;
      dto = (in.com.college.dto.UserDTO) _jspx_page_context.getAttribute("dto", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (dto == null){
        dto = new in.com.college.dto.UserDTO();
        _jspx_page_context.setAttribute("dto", dto, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<span class=\"pl-sm-5\"><b>First Name</b> <span\r\n");
      out.write("								style=\"color: red;\">*</span></span> </br>\r\n");
      out.write("							<div class=\"col-sm-12\">\r\n");
      out.write("								<div class=\"input-group\">\r\n");
      out.write("									<div class=\"input-group-prepend\">\r\n");
      out.write("										<div class=\"input-group-text\">\r\n");
      out.write("											<i class=\"fa fa-user-alt grey-text\" style=\"font-size: 1rem;\"></i>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<input type=\"text\" class=\"form-control\" name=\"firstName\"\r\n");
      out.write("										placeholder=\"First Name\" value=\"\">\r\n");
      out.write("								</div>\r\n");
      out.write("								");

										if (firstname != null) {
									
      out.write("<font color=\"red\" class=\"pl-sm-5\">");
      out.print(firstname);
      out.write("</font>\r\n");
      out.write("									");

										}
									
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<span class=\"pl-sm-5\"><b>Last Name</b> <span\r\n");
      out.write("								style=\"color: red;\">*</span></span></br>\r\n");
      out.write("							<div class=\"col-sm-12\">\r\n");
      out.write("								<div class=\"input-group\">\r\n");
      out.write("									<div class=\"input-group-prepend\">\r\n");
      out.write("										<div class=\"input-group-text\">\r\n");
      out.write("											<i class=\"fa fa-user-circle grey-text\"\r\n");
      out.write("												style=\"font-size: 1rem;\"></i>\r\n");
      out.write("										</div>\r\n");
      out.write("										");

										if (lastname != null) {
									
      out.write("<font color=\"red\" class=\"pl-sm-5\">");
      out.print(lastname);
      out.write("</font>\r\n");
      out.write("									");

										}
									
      out.write("\r\n");
      out.write("									</div>\r\n");
      out.write("									<input type=\"text\" class=\"form-control\" name=\"lastName\"\r\n");
      out.write("										placeholder=\"Last Name\" value=\"\">\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<span class=\"pl-sm-5\"><b>Password</b> <span\r\n");
      out.write("								style=\"color: red;\">*</span></span> </br>\r\n");
      out.write("							<div class=\"col-sm-12\">\r\n");
      out.write("								<div class=\"input-group\">\r\n");
      out.write("									<div class=\"input-group-prepend\">\r\n");
      out.write("										<div class=\"input-group-text\">\r\n");
      out.write("											<i class=\"fa fa-key grey-text\" style=\"font-size: 1rem;\"></i>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<input type=\"password\" class=\"form-control\" name=\"password\"\r\n");
      out.write("										placeholder=\"password\" value=\"\">\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("								");

										if (password != null) {
									
      out.write("<font color=\"red\" class=\"pl-sm-5\">");
      out.print(password);
      out.write("</font>\r\n");
      out.write("									");

										}
									
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<span class=\"pl-sm-5\"><b>Email Id</b> <span\r\n");
      out.write("								style=\"color: red;\">*</span></span> </br>\r\n");
      out.write("							<div class=\"col-sm-12\">\r\n");
      out.write("								<div class=\"input-group\">\r\n");
      out.write("									<div class=\"input-group-prepend\">\r\n");
      out.write("										<div class=\"input-group-text\">\r\n");
      out.write("											<i class=\"fa fa-envelope grey-text\" style=\"font-size: 1rem;\"></i>\r\n");
      out.write("										</div>\r\n");
      out.write("										");

										if (login != null) {
									
      out.write("<font color=\"red\" class=\"pl-sm-5\">");
      out.print(login);
      out.write("</font>\r\n");
      out.write("									");

										}
									
      out.write("\r\n");
      out.write("									</div>\r\n");
      out.write("									<input type=\"text\" class=\"form-control\" id=\"defaultForm-email\"\r\n");
      out.write("										name=\"emailId\" placeholder=\"email Id\" value=\"\">\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<span class=\"pl-sm-5\"><b>DOB</b> <span style=\"color: red;\">*</span></span></br>\r\n");
      out.write("							<div class=\"col-sm-12\">\r\n");
      out.write("								<div class=\"input-group\">\r\n");
      out.write("									<div class=\"input-group-prepend\">\r\n");
      out.write("										<div class=\"input-group-text\">\r\n");
      out.write("											<i class=\"fa fa-calendar grey-text\" style=\"font-size: 1rem;\"></i>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<input type=\"date\" name=\"dob\" class=\"form-control\"\r\n");
      out.write("										placeholder=\"Date Of Birth\" value=\"\">\r\n");
      out.write("								</div>\r\n");
      out.write("								");

										if (dob != null) {
									
      out.write("<font color=\"red\" class=\"pl-sm-5\">");
      out.print(dob);
      out.write("</font>\r\n");
      out.write("									");

										}
									
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<div class=\"text-center\">\r\n");
      out.write("								<br> <input type=\"submit\" name=\"operation\"\r\n");
      out.write("									class=\"btn btn-success btn-md\" style=\"font-size: 17px\"\r\n");
      out.write("									value=\"SignUp\"> <input type=\"submit\" name=\"operation\"\r\n");
      out.write("									class=\"btn btn-secondary btn-md\" style=\"font-size: 17px\"\r\n");
      out.write("									value=\"OP_RESET\">\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-4 mb-4\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("	</main>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write(" position: fixed;\r\n");
      out.write("   left: 0;\r\n");
      out.write("   bottom: 0;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("/*      background-color: #343a40;\r\n");
      out.write(" */      color: white;\r\n");
      out.write("   text-align: center;\r\n");
      out.write(" background-image:  linear-gradient(to bottom right, white, black, grey);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<h5>&copy; RAYS Technologies</h5></center>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("	\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}