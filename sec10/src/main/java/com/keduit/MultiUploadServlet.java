package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/multiUpload.do")
public class MultiUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String savePath = "upload";
		int uploadFileSizeLimit = 5 * 1024 * 1024;
		String encType = "UTF-8";

		ServletContext context = getServletContext();
		// 컨테이너가 가지고 있는 realpath
		String uploadFilePath = context.getRealPath(savePath);

		MultipartRequest multi = new MultipartRequest(request, uploadFilePath, uploadFileSizeLimit,
				new DefaultFileRenamePolicy());
		Enumeration<String> files = multi.getFileNames();
		while (files.hasMoreElements()) {
			String file = files.nextElement();
			String file_name = multi.getFilesystemName(file);
			out.println("<br>업로드된 파일명: " + file_name);
			file_name = multi.getOriginalFileName(file);
			out.println("<br>원본 파일명: " + file_name);
			out.println("<hr>");

		}
	}

}
