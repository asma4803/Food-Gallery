<%-- 
    Document   : ViewOrderCode
    Created on : Feb 5, 2018, 8:20:35 PM
    Author     : Asma Munir
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%@include file="Header.jsp" %>

    <body>
        <h1 style="text-align: center">Records</h1>
        <%!
            Connection con = null;
            Statement stmt = null;
            ResultSet rs = null;
            String to = null;
            String from = null;
            String query = null;
        %>


        <%
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodgallery", "root", "");

            from = request.getParameter("from").toString();
            to = request.getParameter("to").toString();

            query = "Select * from selecteditems where date >= '" + from + "' and date <= '" + to + "' ";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if (rs != null) {%>

        <table border='1' cellpadding='2' width='100%'>
            <tr>
                <th>Customer Id</th><th>Item Name</th>  <th>Item Price</th><th>Quantity</th><th>Date</th>
            </tr>
            <%
                while (rs.next()) {%>
            <tr>
                <td rowspan='10'><%=rs.getString(6)%></td>
                <%  
                    while (rs.next()) {
                %>
                <td><%=rs.getString(1)%> </td>
                <td>  <%=rs.getDouble(2)%></td> 
                <td><%=rs.getInt(3)%></td>
                <td><%=rs.getString(7)%></td>
            </tr>
            <%   }
 rs.next();
                }%>
        </table><br><br><br><br><br><br><br><br><br><br><br><br>

        <% } else {
                out.println("<p>No Record Found!</p>");
            }
        %>
    </body>
    <%@include file="Footer.jsp" %>


</html>
