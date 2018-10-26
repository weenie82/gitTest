package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionForward;
import action.ProductActionFactory;

/**
 * Servlet implementation class ProductControlServlet
 */
@WebServlet("*.do")
public class ProductControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		req.setCharacterEncoding("utf-8");
		
		String requestURI= req.getRequestURI();
		String contextpath=req.getContextPath();
		String cmd=requestURI.substring(contextpath.length());
		
		ProductActionFactory paf= ProductActionFactory.getInstance();
		Action action= paf.action(cmd);
		
		ActionForward af =null;
		try 
		{
			af = action.execute(req);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		if(af.isRedirect()) 
		{
			res.sendRedirect(af.getPath());
		}
		else 
		{
			RequestDispatcher rd=req.getRequestDispatcher(af.getPath());
			rd.forward(req, res);
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
