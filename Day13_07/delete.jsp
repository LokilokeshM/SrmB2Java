<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
if(request.getParameter("but4")!=null)
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
    PreparedStatement ps=conn.prepareStatement("Delete from student where cname=?");
    ps.setString(1,request.getParameter("cname"));
    ps.executeUpdate();
}

%>
