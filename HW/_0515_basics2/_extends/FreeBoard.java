package _0515_basics2._extends;

import java.util.ArrayList;
import java.util.List;

public class FreeBoard implements Board{

    private List<String> posts = new ArrayList<>();

    public void savePost(String post) {
        posts.add(post);
        System.out.println("자유게시판에 새로운 게시글이 저장되었습니다.");
    }

    public void updatePost(int index, String updatedPost) {
        if (index >= 0 && index < posts.size()) {
            posts.set(index, updatedPost);
            System.out.println("자유게시판의 게시글이 수정되었습니다.");
        } else {
            System.out.println("유효하지 않은 값입니다.");
        }
    }
    public void deletePost(int index) {
        if (index >= 0 && index < posts.size()) {
            posts.remove(index);
            System.out.println("자유게시판의 게시글이 삭제되었습니다.");
        } else {
            System.out.println("유효하지 않은 값입니다.");
        }
    }

    public void displayPosts() {
        System.out.println("자유게시판의 모든 게시글을 출력합니다:");
        for (String post : posts) {
            System.out.println(post);
        }
    }


}
