package seven;

public class FindTheNextPerfectSquare {

    public static long findNextSquare(long sq) {
        double sqrt = Math.sqrt(sq);

        if (sq % Math.sqrt(sq) == 0) {
            return (long) Math.pow(sqrt + 1, 2);
        }

        return -1;
    }
}
