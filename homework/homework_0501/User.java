package homework_0501;

public class User {
	
	private long id;
	private String username;
	private String password;
	
//	Getter method : private으로 감춰져 있는 필드명을 기입.
	public long getId() {
		return id;
	}
//	Setter method : void로 출력해야하고 this객체로 
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//	public class Person {
//	    private String name;
//
//	    // Getter 메서드
//	    public String getName() {
//	        return name;
//	    }
//
//	    // Setter 메서드
//	    public void setName(String name) {
//	        this.name = name;
//	    }
//	}
//
//	public class Main {
//	    public static void main(String[] args) {
//	        Person person = new Person();
//	        person.setName("John");
//
//	        System.out.println("Person's name: " + person.getName());
//	    }
//	}
	
	
	
	
	
	
//	3. User 클래스를 생성하세요. long id, String username, String password를 필드로 가지고
//	getter, setter 메소드를 구현하세요. id, username, password 필드는 private으로 지정합니다.


}
