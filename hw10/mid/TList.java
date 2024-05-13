package hw10.mid;

import java.util.ArrayList;
import java.util.List;

//  5. 제네릭 타입의 리스트를 멤버 변수로 갖는 TList라는 제네릭 클래스를 만들고 splitList라는 메소드를 만들고
//  멤버변수인 List를 반반씩 두개의 리스트로 나누는 기능을구현하세요.
//  (리스트의 요소 개수가 짝수면 반반 동일한 개수로, 홀수면 첫 번째 리스트의 요소가 한 개씩 많게)
public class TList<T> {

    private List<T> list = new ArrayList<>();

    public TList() {}

    public List<List<T>> splitList(List<T> list) {
        List<List<T>> resultList = new ArrayList<>();

        // 홀수
        List<T> list1 = new ArrayList<>(list.subList(0, list.size() / 2));
        // 짝수
        List<T> list2 = new ArrayList<>(list.subList(list.size() / 2, list.size()));

        resultList.add(list1);
        resultList.add(list2);

        return resultList;
    }
}


