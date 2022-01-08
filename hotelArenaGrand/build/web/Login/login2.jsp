

<%
    
    String email = request.getParameter("email");
    String pass = request.getParameter("pass");
    

if(email.equals("amasha@gmail.com")&& pass.equals("1234"))
{
    session.setAttribute("email", email);
    response.sendRedirect("index.jsp");
}

else
{
    out.println("Your Email Address or Password is not matching!");
}





%>