package ch03;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest {
    public static void array() {
        int[] a = new int[10];
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(a));

        // 浅拷贝
        int[] b = a;
        // 深拷贝
        int[] c = Arrays.copyOf(a, 2 * a.length);
    }

    public static void arrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList.toString());
    }

    public static void main(String[] args) {
        array();
        arrayList();
    }
}
