package hw11.base02.inheritance.parent;

public class ChildA extends Parent {

    // 이름 속성 추가
    private String name;

    public ChildA(String firstName, String bloodType, int stature, String skinColor, String name) {
        super(firstName, bloodType, stature, skinColor);
        this.name = name;
    }
}
