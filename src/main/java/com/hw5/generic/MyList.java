package main.java.com.hw5.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Number> {
    private ArrayList<T> list;

    public MyList() {
        list = new ArrayList<T>();
    }

    public void add(T data) {
        list.add(data);
    }

    public T findMinValue() {
        Collections.sort((List) list);
        return list.get(0);
    }

    public T findMaxValue() {
        Collections.sort(list, Collections.reverseOrder());
        return list.get(0);
    }
}
