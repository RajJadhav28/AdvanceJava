package ShopApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShopApp
 */
@WebServlet("/ShopApp")
public class ShopApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopApp() {
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
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        int total = 0;

	        out.println("<html><body>");
	        out.println("<h1>Selected Items and Total Cost</h1>");
	        out.println("<ul>");

	        // Check each item individually and add to the total if selected
	        if (request.getParameter("Pizza") != null) {
	            total += 100;
	            out.println("<li>Pizza: $100</li>");
	        }
	        if (request.getParameter("Burger") != null) {
	            total += 90;
	            out.println("<li>Burger: $90</li>");
	        }
	        if (request.getParameter("Cola") != null) {
	            total += 20;
	            out.println("<li>Cola: $20</li>");
	        }
	        if (request.getParameter("Fries") != null) {
	            total += 80;
	            out.println("<li>Fries: $80</li>");
	        }
	        if (request.getParameter("Pasta") != null) {
	            total += 200;
	            out.println("<li>Pasta: $200</li>");
	        }

	        out.println("</ul>");
	        out.println("<h2>Total: $" + total + "</h2>");
	        out.println("</body></html>");
	        out.close();
	}

}
