package j.util;

import java.util.List;

public class ArrayUtils {

    public static int[] toArray(List<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i=0; i< arr.length; i++) {
            Integer num = list.get(i);
            if (num != null) {
                arr[i] = num;
            }
        }

        return arr;
    }
}
