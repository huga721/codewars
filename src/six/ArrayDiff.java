package six;

import java.util.ArrayList;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();

        if (b.length == 0) {
            return a;
        }

        for (int i = 0; i < a.length; i++) {

            boolean isInArray = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    isInArray = true;
                    break;
                }
            }
            if (!isInArray) {
                list.add(a[i]);
            }
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
