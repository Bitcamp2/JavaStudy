package hw11.base02.inheritance.parent;

public class ChildB extends Parent {

    // 지문 속성 추가
    private String fingerPrint;

    public ChildB(String firstName, String bloodType, int stature, String skinColor, String fingerPrint) {
        super(firstName, bloodType, stature, skinColor);
        this.fingerPrint = fingerPrint;
    }
}
