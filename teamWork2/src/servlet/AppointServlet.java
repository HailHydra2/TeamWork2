package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.Appointment;
import service.AppointService;

/**
 * Servlet implementation class AppointServlet
 */
@WebServlet("/AppointServlet")
public class AppointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static AppointService appointService = new AppointService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppointServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = (String)request.getParameter("name");
		String IdNumber = (String)request.getParameter("IdNumber");
		String phoneNumber = (String)request.getParameter("phoneNumber");
		String quantityString = (String)request.getParameter("quantity");
		System.out.println(quantityString);
		int quantity = Integer.parseInt(quantityString);
		
		System.out.println(name + " " + IdNumber +" " + phoneNumber + " " + quantity);
		
		Appointment appointment = new Appointment();
		appointment.setName(name);
		appointment.setIdNumber(IdNumber);
		appointment.setPhoneNumber(phoneNumber);
		appointment.setQuantity(quantity);
		
		if(appointService.doesCanAppoint(appointment)) {
			
		}else {
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
