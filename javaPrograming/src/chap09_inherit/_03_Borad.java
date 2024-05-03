package chap09_inherit;

import chap11_abstraction.board.Board;
import chap11_abstraction.board.FreeBoard;
import chap11_abstraction.board.NoticeBoard;

public class _03_Borad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new FreeBoard(1, "안녕하세요.", "자바 어려워요", "고기천", "2024-05-02", 
				"첨부파일1");
		
		board.post();
		
		board = new NoticeBoard(1, "안녕하세요.", "공지사항", "관리자", "2024-05-02", true);
		
		board.post();
		
		}
	}
