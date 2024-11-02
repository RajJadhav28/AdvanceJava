package IncludeForward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class infwservlet1
 */
@WebServlet("/infwservlet1")
public class infwservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public infwservlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		String un=request.getParameter("uname");
		String pw=request.getParameter("pw");
		if(un.equals("raj")&&pw.equals("123")) {
			RequestDispatcher rd=request.getRequestDispatcher("infwservlet2");
			rd.forward(request, response);
		}else {
			out.println("<font color='red'> Sorry Username or password mismatch</font>");
			RequestDispatcher rd=request.getRequestDispatcher("infw.html");
			rd.include(request, response);
		}
		
	}

}
