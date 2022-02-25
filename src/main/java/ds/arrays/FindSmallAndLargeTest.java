package ds.arrays;

public class FindSmallAndLargeTest {
    public static void main(String[] args) {
        System.out.println("FindSmallAndLargeTest");
        int arr[] =  {2,5,7,2,45,8,1};
        findSmallAndLarge(arr);
    }

    private static void findSmallAndLarge(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            } else if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min + " : "+max);
    }
}
