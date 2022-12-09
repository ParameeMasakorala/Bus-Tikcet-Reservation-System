package com.busticket.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MakeReservation
 */

@WebServlet("/MakeReservationServelet")
public class MakeReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getParameter("Name");
		request.getParameter("Mobile_no");
		request.getParameter("Destination");
		request.getParameter("Seat_no");
		request.getParameter("No_of_passenger");
		
		
		boolean isTrue;
		
		isTrue = MakeReservationUtil.insertreservation(Name,Mobile_no,Destination,Seat_no,No_of_passenger);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("MakeReservation.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("");
			dis2.forward(request, response);
		}
		
		
		
	}

}



