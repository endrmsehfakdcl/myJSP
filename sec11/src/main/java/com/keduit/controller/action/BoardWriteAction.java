package com.keduit.controller.action;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.BoardDAO;
import com.keduit.dto.BoardVO;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// insertBoard 를 호출
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		BoardVO bVO = new BoardVO();
		bVO.setName(name);
		bVO.setPass(pass);
		bVO.setEmail(email);
		bVO.setTitle(title);
		bVO.setContent(content);

		BoardDAO bDAO = BoardDAO.getInstance();
		bDAO.insertBoard(bVO);

//		new BoardListAction().execute(request, response);

//		List<BoardVO> boardList = bDAO.selectAllBoards();
//		request.setAttribute("boardList", boardList);
		
		request.setAttribute("boardList", bDAO.selectAllBoards());
		response.sendRedirect("BoardServlet?command=board_list");

//		RequestDispatcher dispatcher = request.getRequestDispatcher("board/boardList.jsp");
//		dispatcher.forward(request, response);
	}
}
