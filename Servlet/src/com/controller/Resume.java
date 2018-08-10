package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.ResumeModel;
import com.sun.crypto.provider.RSACipher;

/**
 * Servlet implementation class Resume
 */
@WebServlet("/Servlet")
public class Resume extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Resume() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ResumeModel res = new ResumeModel();

		res.setFirstName(request.getParameter("firstname"));
		res.setLastName(request.getParameter("lastname"));
		res.setGender(request.getParameter("Gender"));
		res.setHighestQualification(request.getParameter("HighestQualification"));
		res.setHobbies(request.getParameterValues("Hobbies"));
		res.setSkills(request.getParameterValues("skills"));
		res.setDateOfBirth(request.getParameter("DateOfBirth"));
		res.setAddress(request.getParameter("Address"));
		res.setEmail(request.getParameter("email"));
		res.setWebsite(request.getParameter("website"));
		res.setContact(request.getParameter("Contact"));
		res.setDescription(request.getParameter("description"));

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
