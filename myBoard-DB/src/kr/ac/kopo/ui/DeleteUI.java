package kr.ac.kopo.ui;

public class DeleteUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("-----------------------------------------");
		System.out.println("\t<<< 게시글 삭제 서비스>>>");
		System.out.println("-----------------------------------------");

		int no = scanInt("삭제할 게시물 번호를 입력 : ");
		if (service.removeBoard(no)) {
			System.out.println("[" + no + "]번 게시글이 삭제되었습니다.");
		} else {
			System.out.println("해당 번호의 게시글이 없습니다.");
		}

	}

}
