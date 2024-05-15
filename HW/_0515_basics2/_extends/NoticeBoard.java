package _0515_basics2._extends;

public class NoticeBoard implements Board{

    // 게시글을 저장할 변수
    private String notice;

    public NoticeBoard(String notice) {
        this.notice = notice;
    }

    public void savePost(String post) {
        this.notice = post;
        System.out.println("공지게시판에 새로운 공지가 저장되었습니다.");
    }

    // 게시글 조회 메소드 구현
    public void displayPosts() {
        System.out.println("공지게시판의 공지사항을 출력합니다:");
        System.out.println(notice);
    }

    public void updatePost(int index, String updatedPost) {
        // 공지는 수정할 수 없으므로 빈 메소드로 남김
    }

    public void deletePost(int index) {

    }

}
