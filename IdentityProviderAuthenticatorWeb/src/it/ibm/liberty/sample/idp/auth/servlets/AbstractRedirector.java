package it.ibm.liberty.sample.idp.auth.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AbstractRedirector
 */
public abstract class AbstractRedirector extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		service(req, res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		service(req, res);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		ServletContext ctx0 = req.getServletContext();
		ServletContext ctx = ctx0.getContext("/idp");
		String contextPath = ctx0.getContextPath();
		ctx.getRequestDispatcher(req.getRequestURI().substring(contextPath.length())).forward(req, res);
	}
}
