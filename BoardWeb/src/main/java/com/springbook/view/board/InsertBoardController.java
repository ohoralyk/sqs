package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.board.BoardVO;
import com.springbook.view.controller.Controller;

public class InsertBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�� ��� ó��");
		
		//1. ����� �Է� ���� ����
		//request.setCharacterEncoding("EUC-KR");
		String title 	= request.getParameter("title");
		String writer 	= request.getParameter("writer");
		String content 	= request.getParameter("content");
		
		//2. DB ���� ó��
		BoardVO vo = new BoardVO();
		
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		//3. ȭ�� �׺���̼�
		return "getBoardList.do";
	}

}
