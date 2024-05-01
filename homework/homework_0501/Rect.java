package homework_0501;

public class Rect {
//	2. Rect 클래스를 생성하세요. int width, int height를 필드로 갖고
	public int width;
	public int height;
	
	public Rect () {
		
	}
//	기본생성자와 모든 필드를 초기화하는 생성자 두 개를 정의하세요. // 오버로딩느낌
	public Rect(int width) {
		this.width = width;
	}
	public Rect(int width, int height) {
		this.height = height;
	}
	
//	그리고 사각형의 둘레를 리턴하는 메소드와 사각형의 넓이를 리턴하는 메소드를 구현하세요.
	
	public int width(int width) {
		return this.width;
	}
	
	public int height(int height) {
		return this.height;
	}
	
	
	
	
//	3. User 클래스를 생성하세요. long id, String username, String password를 필드로 가지고
//	getter, setter 메소드를 구현하세요. id, username, password 필드는 private으로 지정합니다.

}
