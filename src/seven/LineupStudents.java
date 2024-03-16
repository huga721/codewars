package seven;

import java.util.Arrays;
import java.util.Collections;

public class LineupStudents {
    public static String[] lineupStudents(String students)
    {
        String[] res = students.split(" ");
        String word;
        boolean bubbleSort;
        Arrays.sort(res, Collections.reverseOrder());
        do {
            bubbleSort = false;
            for (int i = 0; i < res.length - 1; i++) {
                if (res[i].length() < res[i + 1].length()) {
                    word = res[i + 1];
                    res[i + 1] = res[i];
                    res[i] = word;

                    bubbleSort = true;
                }
            }
        } while (bubbleSort);
        return res;
    }
}
