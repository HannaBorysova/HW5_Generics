package main.java.com.hw5.generic;

import java.util.ArrayList;

public class MyList<T extends Number> {
    private ArrayList<T> list;

    public MyList() {
        list = new ArrayList<T>();
    }

    public void add(T data) {
        list.add(data);
    }

    public T findMinValue() {
        if (list.size() > 0) {
            int min = 0;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).intValue() < list.get(min).intValue()) {
                    min = i;
                }
            }
            return list.get(min);
        }
        return null;
    }

    public T findMaxValue() {
        if (list.size() > 0) {
            int max = 0;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).intValue() > list.get(max).intValue()) {
                    max = i;
                }
            }
            return list.get(max);
        }
        return null;
    }
}
