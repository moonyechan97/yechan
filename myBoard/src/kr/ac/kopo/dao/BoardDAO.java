package kr.ac.kopo.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.vo.BoardVO;

//Data Access Object
public class BoardDAO {
	private List<BoardVO> list;

	public BoardDAO() {
		list = new ArrayList<>();
	}

	public void insert(BoardVO board) {
		list.add(board);
	}

	public List<BoardVO> selectAll() {
		return list;
	}

	public BoardVO selectOne(int no) {
		for (BoardVO board : list) {
			if (board.getNo() == no) {
				return board;
			}
		}
		return null;
	}

	public void update(int no, String title, String writer) {
		BoardVO board = selectOne(no);
		board.setTitle(title);
		board.setWriter(writer);
	}

	public void delete(int no) {
		list.remove(selectOne(no));
	}
}
