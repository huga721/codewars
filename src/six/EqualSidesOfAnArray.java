package six;

public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftIndexSum = 0;
            int rightIndexSum = 0;

            for (int left = i - 1; left >= 0; left--) {
                leftIndexSum += arr[left];
            }

            for (int right = i + 1; right < arr.length; right++) {
                rightIndexSum += arr[right];
            }

            if (leftIndexSum == rightIndexSum) {
                return i;
            }
        }

        return -1;
    }
}
