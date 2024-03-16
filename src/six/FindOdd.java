package six;

public class FindOdd {
    public static int findIt(int[] a) {
        int maxOdd = 0;
        int winner = 0;
        for (int i = 0; i < a.length; i++) {
            int countOdd = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    countOdd = countOdd + 1;
                    System.out.println(j);
                    System.out.println(a[i] + "    " + a[j]  + "     " + countOdd);
                }
            }
            if (countOdd % 2 != 0 && countOdd > maxOdd) {
                maxOdd = countOdd;
                winner = a[i];
            }
        }
        return winner;
    }
}
