package in.srivath;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MsgServlet")
public class MessageServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String user = request.getParameter("username");
		response.getWriter().append("<h1>Hi " + user + " Welcome !!!</h1>");
	}
}
