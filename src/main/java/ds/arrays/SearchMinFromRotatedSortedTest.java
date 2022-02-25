package ds.arrays;

public class SearchMinFromRotatedSortedTest {
    public static void main(String[] args) {
        System.out.println("FindMinFromRotatedSortedTest");
        int arr[] = {16, 19, 21, 25, 1, 3,5, 8, 10};
        searchMinFromRotatedSorted(arr);
    }

    private static void searchMinFromRotatedSorted(int[] arr) {
        binarySearch(arr, 0, arr.length - 1, Integer.MAX_VALUE);
    }

    private static void binarySearch(int[] arr, int low, int high, int min) {

        while (low < high) {
            if (min > arr[low]) {
                min = arr[low];
            }

            int mid = (low + high) / 2;
            if (arr[mid] < min) {
                min = arr[mid];
            }

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(min);
    }
}
