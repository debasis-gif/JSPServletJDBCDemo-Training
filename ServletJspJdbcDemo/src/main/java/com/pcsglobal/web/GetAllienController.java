// GetAllienController to receive the request for data

package com.pcsglobal.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pcsglobal.web.dao.AllienDao;
import com.pcsglobal.web.model.Allien;

/**
 * Servlet implementation class GetAllienController
 */
@SuppressWarnings({ "serial", "unused" })
// @WebServlet("/getAllien")
public class GetAllienController extends HttpServlet 
{
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int aid = Integer.parseInt(request.getParameter("aid")); // fetching the request parameter input from index.jsp form
		AllienDao dao = new AllienDao();    // creating the object dao by instantiating the AllienDao 
		Allien al1 = null;
		
		try {
			al1 = dao.getAllien(aid);   // creating the Allien type al1 and returning the record from dao object using getAllien()
		} catch (SQLException e) {
			e.printStackTrace();
		}    
		
		// Using Request Dispatcher with request object
		/*
		request.setAttribute("alien", al1);		// putting the entire al1 (Allien) object into request object to be dispatched to jsp
		RequestDispatcher rd = request.getRequestDispatcher("showAllien.jsp");
		rd.forward(request, response);    // The client will not be able to see the called pages
		*/
		
		// Using sendRedirect with Session object 
		HttpSession session = request.getSession();
		session.setAttribute("alien", al1);
		
		response.sendRedirect("showAllien.jsp");
		
		
	}
}
