package keckc;

import java.util.List;

public class MergeSort {
    public static <T extends Comparable<T>> void mergeSort(List<T> a) {
        mergeSort(a, 0, a.size() - 1);
    }

    private static <T extends Comparable<T>> void mergeSort(List<T> a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);

            merge(a, left, mid, right);
        }
    }

    private static <T extends Comparable<T>> void merge(List<T> a, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;

        T[] temp = (T[]) new Comparable[right - left + 1];

        while (i <= mid && j <= right) {
            if (a.get(i).compareTo(a.get(j)) < 0) {
                temp[k] = a.get(i);
                i++;
            } else {
                temp[k] = a.get(j);
                j++;
            }

            k++;
        }

        while (i <= mid) {
            temp[k] = a.get(i);
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = a.get(j);
            j++;
            k++;
        }

        for (k = 0; k < temp.length; k++) {
            a.set(left + k, temp[k]);
        }
    }
}
