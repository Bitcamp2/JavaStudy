package hw11.base02.inheritance.alba;

public class Alba {

    //  2. 일한 시간, 시간당 급여를 속성으로 갖는 알바라는 클래스를 만들고
    //  일한다(일한 시간동안 일해서 일한 시간 * 시간당 급여를 받는다. 라고 출력하는)를 메소드로 만드세요.
    //  알바를 상속받는 캐셔와 쿠팡맨 클래스를 만들고 일한다 메소드를 오버라이딩하여
    //  캐셔는 "캐셔는 일한 시간동안 계산해서 일한 시간 * 시간당 급여를 받는다."
    //  쿠팡맨은  "쿠팡맨은 일한 시간동안 배송해서 일한 시간 * 시간당 급여를 받는다."라고 출력하도록 구현하세요.
    //  일한 시간과 시간당 급여는 생성자에서 초기화합니다.

    private int workHour;
    private int workPrice;

    public Alba(int workHour, int workPrice) {
        this.workHour = workHour;
        this.workPrice = workPrice;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public int getWorkPrice() {
        return workPrice;
    }

    public void setWorkPrice(int workPrice) {
        this.workPrice = workPrice;
    }

    public void working() {
        //일한 시간동안 일해서 일한 시간 * 시간당 급여를 받는다. 라고 출력하는
        System.out.println(workHour + "시간 일하고, 시간당 " + (workHour * workPrice) + "를 받습니다.");
    }
}
