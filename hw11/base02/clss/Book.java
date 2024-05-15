package hw11.base02.clss;

public class Book {

    // 2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.

    private String title;
    private String author;
    private String publisher;
    private int price;

    public Book(String title, String author, String publisher, int price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public void printBookInfo() {
        System.out.println("*** 도서 정보 ***");
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("출판사: " + publisher);
        System.out.println("가격: " + price);
    }
}
