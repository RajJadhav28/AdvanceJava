package IncludeForward2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class infwservlet21
 */
@WebServlet("/infwservlet21")
public class infwservlet21 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public infwservlet21() {
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
		PrintWriter out=response.getWriter();
		String un=request.getParameter("uname");
		String pw=request.getParameter("pass");
		if(un.equals("raj")&&pw.equals("123")) {
			RequestDispatcher rd=request.getRequestDispatcher("infwservlet22");
			rd.forward(request, response);
		}else {
			out.print("<font color='red'>Sorry Username or password mismatch</font>");
			RequestDispatcher rd=request.getRequestDispatcher("infw2.html");
			rd.include(request, response);
		}
	}

}
