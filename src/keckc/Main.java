package keckc;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(1);
        a.add(3);

        System.out.println(a);
        MergeSort.mergeSort(a);
        System.out.println(a);
    }
}
