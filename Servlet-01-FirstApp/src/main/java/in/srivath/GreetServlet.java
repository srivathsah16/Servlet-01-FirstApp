package in.srivath;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class GreetServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		LocalDateTime currentDateTime = LocalDateTime.now();
		String curTime = currentDateTime.toString().substring(11, 16); // to get current time hh:mm
		String curHour = currentDateTime.toString().substring(11, 13); // to get current time hh
		int hour = Integer.parseInt(curHour);
		if (hour >= 6 && hour <= 11) {
			writer.append("<h1>Its " + curTime + " now. Good Morning :)</h1>");
		} else if (hour >= 12 && hour <= 15) {
			writer.append("<h1>Its " + curTime + " now. Good Afternoon :)</h1>");
		} else if (hour >= 16 && hour <= 19) {
			writer.append("<h1>Its " + curTime + " now. Good Evening :)</h1>");
		} else if (hour >= 20 || hour <= 5) {
			writer.append("<h1>Its " + curTime + " now. Good Night :)</h1>");
		}
	}

//	public static void main(String[] args) {
//		LocalDateTime currentDateTime = LocalDateTime.now();
//		System.out.println(currentDateTime);
//		String curDateTimeString = currentDateTime.toString();
//		System.out.println(curDateTimeString);
//		String curTime = curDateTimeString.substring(11, 16);
//		String curHour1 = curDateTimeString.substring(11, 13);
//		System.out.println(curTime);
//		int hour = Integer.parseInt(curHour1);
//		if (hour >= 6 && hour <= 11) {
//			System.out.println("Good Morning!");
//		} else if (hour >= 12 && hour <= 15) {
//			System.out.println("Good Afternoon!");
//		} else if (hour >= 16 && hour <= 19) { 
//			System.out.println("Good Evening!");
//		} else if (hour >= 20 || hour <= 5) {
//			System.out.println("Good Night!");
//		}
//	}
}
