package ds.arrays;

import java.util.Arrays;

public class FindPairWithMinSumTest {
    public static void main(String[] args) {
        System.out.println("FindPairWithMinSumTest");
        int[] arr = {1,3,-5,7,8,20,50,-40,6};
        findPairWithMinSum(arr);
    }

    private static void findPairWithMinSum(int[] arr) {
        int minSum = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i:arr)
            System.out.print(i+",");
        System.out.println();

        int length = arr.length-1;
        int index1=0, index2 = 0;

        int left = 0;
        int right = length;
        while(0 <= length){

        }

        for (int i = 0; i < length; i++) {
            int sum = arr[i] + arr[length-i];
            if(sum < minSum){
                index1 = i;
                index2 = length-i;
                minSum = sum;
            }
        }
        System.out.println("pair ["+arr[index1]+","+arr[index2]+"] with sum "+minSum);
    }
}
