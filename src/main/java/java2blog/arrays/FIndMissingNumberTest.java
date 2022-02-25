package java2blog.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FIndMissingNumberTest {
    public static void main(String[] args) {
        System.out.println("FIndMissingNumberTest");
        int[] arr = {5, 2, 6, 1, 4};
        findMissingNumber1(arr);
        findMissingNumber2(arr);
    }

    //approach-1
    private static void findMissingNumber1(int[] arr) {
        int rangeSum = IntStream.range(1, 7).sum();
        int arrSum = Arrays.stream(arr).sum();
        System.out.println(rangeSum - arrSum);
    }

    //approach-2
    private static void findMissingNumber2(int[] arr) {
        int[] arr1 = Arrays.stream(arr).sorted().toArray();
        for (int i = 1; i <= arr1.length; i++) {
            if(i != arr1[i-1]){
                System.out.println(i);
                break;
            }
        }
    }
}