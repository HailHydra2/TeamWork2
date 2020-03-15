package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AppointmentDao;
import pojo.Appointment;

/**
 * Servlet implementation class acquireServlet
 */
@WebServlet("/acquireServlet")
public class acquireServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public acquireServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String ID = request.getParameter("ID");
		
		AppointmentDao dao = new AppointmentDao();
		String sql = "select * from appointment where ID =" + ID;
		System.out.println(sql);
		Appointment appointment = dao.get(sql);
		if(appointment == null) {
			System.out.println("null");
		}else {
			System.out.println("has data");
		}
		request.setAttribute("result", appointment);
		request.getRequestDispatcher("query.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		
	}

}
