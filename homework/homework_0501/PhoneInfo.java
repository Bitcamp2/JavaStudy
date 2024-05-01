package homework_0501;

public class PhoneInfo {
	
	
//	1. PhoneInfo 클래스를 생성하세요.
	String[] names = new String[100];
	String[] phoneNums = new String[100];
	int index = 0;
	
//매개변수로 전달된 이름과 번호를 각각의 배열에 저장하는 기능 구현
	public void insertPhoneInfo(String name, String phoneNum) {
		this.names[index] = name;
		
		this.phoneNums[index] = phoneNum;
	}
	
	//배열에 저장된 모든 이름과 번호를 순서대로 출력하는 기능 구현 
//	상향된 포문 가능한지 ? null !
	public void printAllPhoneInfo() {
		for(String name : names) {
			if(name == null) {
				break;
			}
			System.out.println(name);
		}
			
		for(String phoneNum : phoneNums) {
			if(phoneNum == null) {
				break;
			}
			System.out.println(phoneNum);
			
		}
	}
	
	//매개변수로 전달된 인덱스에 해당하는 이름과 번호 출력하는 기능 구현 // 모르겠어서 수정님 깃 훔쳐봄
	public void printPhoneInfo(int index) {
		System.out.println("이름: " + names[index] + ", 번호: " + phoneNums[index]);
	}
	


	
}
