package java2blog.arrays;

public class FindSecondLargeTest {
    public static void main(String[] args) {
        System.out.println("FindSecondLargeTest");
        int[] arr = {7,5,6,1,4,2,7};
        findSecondLarge(arr);
    }

    private static void findSecondLarge(int[] arr) {
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large){
                secondLarge = large;
                large = arr[i];
            } else if(arr[i] > secondLarge && arr[i] != large){
                secondLarge = arr[i];
            }
        }
        System.out.println("large : "+large +" second large : "+secondLarge);
    }
}
