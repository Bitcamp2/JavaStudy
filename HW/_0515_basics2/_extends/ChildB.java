package _0515_basics2._extends;

public class ChildB extends Parent {

    // 추가된 속성(멤버 변수)
    private String fingerprint;

    // 생성자
    public ChildB(String lastName, String bloodType, double height, String skinColor, String fingerprint) {
        super(lastName, bloodType, height, skinColor); // 부모 클래스의 생성자 호출
        this.fingerprint = fingerprint;

    }

}

