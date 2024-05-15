package _0515_basics2._extends;

public class ChildA extends Parent{

    private String firstName;

    // 생성자
    public ChildA(String firstName, String lastName, String bloodType, double height, String skinColor) {
        super(lastName, bloodType, height, skinColor); // 부모 클래스의 생성자 호출
        this.firstName = firstName;

    }

}


