package homework_05_01;

public class UserBook {
	 
	// User클래스 타입의 값을 100개 저장할 수 있는 배열 
	User[] user = new User [100];
	 // 현재 배열에 위치를 저장하는 index 
	 int index = 0;
	 
	 // 매개변수로 username과 password를 받아 User 객체를 생성하여 배열에 저장하는 메소드
	 public void saveUserInfo(String username, String password) {
		 User u = new User();
		 u.setPassword(password);
		 u.setUsername(username);
		 u.setId(index + 1);
		 
		 user[index] = u;
	 }
	
}
