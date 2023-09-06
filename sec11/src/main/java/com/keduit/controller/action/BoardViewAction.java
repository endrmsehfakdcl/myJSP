package com.keduit.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.BoardDAO;
import com.keduit.dto.BoardVO;
import javax.servlet.http.Cookie;

public class BoardViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "board/boardView.jsp";
		String num = request.getParameter("num");
		BoardDAO bDAO = BoardDAO.getInstance();

		// 중복 조회 방지를 위한 쿠키 확인
		boolean alreadyViewed = isAlreadyViewed(request, num);

		if (!alreadyViewed) {
			// 조회수 증가 및 게시글 조회 처리
			bDAO.updateReadCount(num);
			BoardVO bVO = bDAO.selectOne(num);
			request.setAttribute("board", bVO);

			// 중복 조회 방지를 위한 쿠키 설정
			setAlreadyViewed(response, num);
		} else {
			BoardVO bVO = bDAO.selectOne(num);
			request.setAttribute("board", bVO);
		}

		// JSP 페이지로 포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	private boolean isAlreadyViewed(HttpServletRequest request, String num) {
		// 쿠키를 이용하여 중복 조회 여부 확인
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("viewed_" + num)) {
					return true; // 이미 조회된 경우
				}
			}
		}
		return false; // 아직 조회되지 않은 경우
	}

	private void setAlreadyViewed(HttpServletResponse response, String num) {
		// 쿠키를 설정하여 중복 조회 방지
		Cookie cookie = new Cookie("viewed_" + num, "true");
		cookie.setMaxAge(10); // 쿠키 유효 시간 설정 (예: 10초)
		response.addCookie(cookie);
	}
}
