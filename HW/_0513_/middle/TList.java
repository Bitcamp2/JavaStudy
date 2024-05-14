package _0513_.middle;

import java.util.ArrayList;
import java.util.List;

public class TList <T> {

    private List<T> list;

    public TList() {
        list = new ArrayList<T>();
    }

    public void add(T item) {
        list.add(item);
    }

    public List<List<T>> splitList() {

        List<List<T>> result = new ArrayList<>();

        int sameEach = list.size() / 2;
        int otherPlus = list.size() % 2;

        List<T> firstHalf = new ArrayList<>(list.subList(0, sameEach + otherPlus));
        List<T> secondHalf = new ArrayList<>(list.subList(sameEach + otherPlus, list.size()));

        result.add(firstHalf);
        result.add(secondHalf);

        return result;
    }

    public static void main(String[] args) {
        TList<Integer> tList = new TList<>();

        tList.add(1);
        tList.add(2);
        tList.add(3);
        tList.add(4);
        tList.add(5);
        tList.add(6);
        tList.add(7);

        List<List<Integer>> result = tList.splitList();

        System.out.println(result.get(0));
        System.out.println(result.get(1));


    }




}


