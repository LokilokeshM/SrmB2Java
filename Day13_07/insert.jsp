<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%
    String cname = request.getParameter("cname");
    String addr = request.getParameter("addr");
    String zip = request.getParameter("zip");
    String phone = request.getParameter("phone");
   
    if (request.getParameter("but1") != null) {
        Class.forName("com.mysql.jdbc.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
        PreparedStatement ps = conn.prepareStatement("INSERT INTO `student`(`name`, `address`, `zip`, `phonenumber`) VALUES (?,?,?,?)");
        ps.setString(1, cname);
        ps.setString(2, addr);
        ps.setString(3, zip);
        ps.setString(4, phone);
        ps.executeUpdate();
        ps.close();
        conn.close();
%>
<script type="text/javascript">
    alert("submitted Successfully")
</script>
<%
    }
%>
