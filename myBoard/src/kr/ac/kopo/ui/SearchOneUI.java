package kr.ac.kopo.ui;

import kr.ac.kopo.vo.BoardVO;

public class SearchOneUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		int no = scanInt("조회할 글 번호를 입력하세요: ");

		BoardVO board = service.searchOneBoard(no);
		if (board == null) {
			System.out.println("해당 번호의 게시글이 없습니다");
		} else {
			System.out.println("-----------------------------");
			System.out.println("게시판 번호 : " + board.getNo());
			System.out.println("작 성 날 짜 : " + board.getRegDate());
			System.out.println("제       목 : " + board.getTitle());
			System.out.println("작   성  자 : " + board.getWriter());
			System.out.println("-----------------------------");
		}

	}

}
