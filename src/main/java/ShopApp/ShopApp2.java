package ShopApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShopApp2
 */
@WebServlet("/ShopApp2")
public class ShopApp2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopApp2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String p1=request.getParameter("fruit");
		out.print(p1);
		
		String r=request.getParameter("quantity");
		int r1=Integer.parseInt(r);
		
		int total=0;
		
		if(p1.equals("Mango")) {
			int mprice=30;
			total=mprice*r1;
			out.print("Mango Rupees:"+total);
		}else if(p1.equals("Grapes")) {
			int gprice=40;
			total=gprice*r1;
			out.print("Grapes price:"+total);
		}else if(p1.equals("Apple")) {
			int aprice=50;
			total=aprice*r1;
			out.print("Apple price:"+total);
		}else {
			out.print("please select fruit!!!");
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
