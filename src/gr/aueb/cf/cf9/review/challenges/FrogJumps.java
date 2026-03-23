package gr.aueb.cf.cf9.review.challenges;

/**
 * From a point x, go to a point y
 * where each jump distance is equal to jump.
 *
 * Given:
 * x = 10
 * y = 55
 * jump = 25
 */
public class FrogJumps {

    public static void main(String[] args) {

    }

    public static int totalJumps(int start, int end, int jump) {
        int jumpCount = 0;

        while (start < end) {
            start += jump;
            jumpCount++;
        }
        return jumpCount;
    }

    public static int totalJumps2(int start, int end, int jump) {
        return (int) Math.ceil((end - start) / (double) jump);
    }
}
