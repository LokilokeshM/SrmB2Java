<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%
if(request.getParameter("but3")!=null)
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");       
    PreparedStatement ps=conn.prepareStatement("update Student set addr=?,phone=?,zip=? where cname=?");
    ps.setString(1,request.getParameter("addr"));
    ps.setString(4, request.getParameter("phone"));
    ps.setString(5, request.getParameter("zip"));
    ps.setString(6,request.getParameter("cname"));
    ps.executeUpdate();
}


%>