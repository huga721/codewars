package six;

public class CircularlySorterArray {
    public boolean isCircleSorted(int[] a) {
        int count = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                count++;
            }
        }

        if (count == 1) {
            return a[0] > a[a.length - 1];
        }
        return count <= 1;
    }
}
