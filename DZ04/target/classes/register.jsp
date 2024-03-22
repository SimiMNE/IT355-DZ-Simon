<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.util.Base64" %>

<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String confirmPassword = request.getParameter("confirmPassword");

    if (email != null && password != null && confirmPassword != null && password.equals(confirmPassword)) {

        String encodedEmail = URLEncoder.encode(email, "UTF-8");
        String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes("UTF-8"));


        response.addCookie(new Cookie("email", encodedEmail));
        response.addCookie(new Cookie("password", encodedPassword));

        response.sendRedirect("home.jsp");
    } else {

        response.sendRedirect("index.jsp");
    }
%>
