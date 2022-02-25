package algo.slidingWindow;


public class AvgOfSubArrayWithKSizeTest {

    public static void main(String[] args) {
        System.out.println("AvgOfSubArrayWithKSizeTest");
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        avgOfSubArrayWithKSize(arr, k);
    }

    private static void avgOfSubArrayWithKSize(int[] arr, int k) {
        float[] result = new float[k];
        float sum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum = sum + arr[end];
            if (end >= k - 1) {
                result[start] = sum / k;
                sum = sum - arr[start];
                start++;
            }
        }

        for (float f : result) {
            System.out.print(f + " ");
        }

    }
}
