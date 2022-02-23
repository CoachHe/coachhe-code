<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
     
你好  JSP

<%
    request.getRequestDispatcher("hello.jsp").forward(request, response);
%>