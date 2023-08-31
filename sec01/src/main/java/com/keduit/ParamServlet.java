package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamServlet
 */
@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ParamServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String id = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age"));

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("당신이 입력한 자료입니다.<br>");
		out.print("아이디 : ");
		out.println(id);
		out.print("나이 : ");
		out.println(age);
		out.println("<br><a href='javascript:history.go(-1)'>다시입력</a>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String id = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age"));

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("당신이 입력한 자료입니다.<br>");
		out.print("아이디 : ");
		out.println(id);
		out.print("나이 : ");
		out.println(age);
		out.println("<br><a href='javascript:history.go(-1)'>다시입력</a>");
		out.println("</body></html>");
	}

}
