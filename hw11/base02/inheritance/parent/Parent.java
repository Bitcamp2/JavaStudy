package hw11.base02.inheritance.parent;

public class Parent {

    // 성씨, 혈액형, 키, 피부색을 속성으로 가지는 Parent 클래스를 생성하고 Parent를 상속받은 ChildA, ChildB 클래스를 만들어서
    // ChildA에는 이름 속성을 추가하고 ChildB에는 지문 속성을 추가하세요.

    private String firstName;
    private String bloodType;
    private int stature;
    private String skinColor;

    public Parent(String firstName, String bloodType, int stature, String skinColor) {
        this.firstName = firstName;
        this.bloodType = bloodType;
        this.stature = stature;
        this.skinColor = skinColor;
    }
}
