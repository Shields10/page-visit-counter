package com.pagevisitcounter;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class PageVisitCounter
 */
public class PageVisitCounterServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        HttpSession session = request.getSession(true);

	        int visitCount = getVisitCount(session);
	        session.setAttribute("visited", true);
	        request.setAttribute("visitCount", visitCount);

	        request.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
	    }

	    private int getVisitCount(HttpSession session) {
	        Integer visitCount = (Integer) session.getAttribute("visitCount");
	        if (visitCount == null) {
	            visitCount = 1;
	        } else {
	            visitCount++;
	        }
	        session.setAttribute("visitCount", visitCount);
	        return visitCount;
	    }

}
