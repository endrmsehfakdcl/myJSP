package com.keduit.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.BoardDAO;
import com.keduit.dto.BoardVO;

public class BoardUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		int num = Integer.parseInt(request.getParameter("num"));

		BoardVO bVO = new BoardVO();
		bVO.setName(name);
		bVO.setPass(pass);
		bVO.setEmail(email);
		bVO.setTitle(title);
		bVO.setContent(content);
		bVO.setNum(num);

		BoardDAO bDAO = BoardDAO.getInstance();
		bDAO.updateBoard(bVO);

		request.setAttribute("boardList", bDAO.selectAllBoards());
		response.sendRedirect("BoardServlet?command=board_list");

	}

}
