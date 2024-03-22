<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.util.Base64" %>

<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");


    Cookie[] cookies = request.getCookies();
    String savedEmail = null;
    String savedPassword = null;
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("email")) {
                savedEmail = URLDecoder.decode(cookie.getValue(), "UTF-8");
            } else if (cookie.getName().equals("password")) {
                savedPassword = new String(Base64.getDecoder().decode(cookie.getValue()), "UTF-8");
            }
        }
    }


    if (email != null && password != null && email.equals(savedEmail) && password.equals(savedPassword)) {

        response.sendRedirect("home.jsp");
    } else {

        response.sendRedirect("index.jsp");
    }
%>
