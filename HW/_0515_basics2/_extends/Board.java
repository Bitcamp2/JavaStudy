package _0515_basics2._extends;

public interface Board {

    void savePost(String post);
    void updatePost(int index, String updatedPost);
    void deletePost(int index);
    void displayPosts();

}
