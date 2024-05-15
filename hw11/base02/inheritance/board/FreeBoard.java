package hw11.base02.inheritance.board;

public class FreeBoard implements Board{


    @Override
    public void savePost() {
        System.out.println("자유게시판 글을 저장합니다.");
    }

    @Override
    public void editPost() {
        System.out.println("자유게시판 글을 수정합니다.");
    }

    @Override
    public void deletePost() {
        System.out.println("자유게시판 글을 삭제합니다.");
    }

    @Override
    public void viewPost() {
        System.out.println("자유게시판을 조회합니다.");
    }
}
