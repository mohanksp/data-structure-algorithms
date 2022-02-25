package ds.arrays;

public class SearchInRotatedSortedTest {

    public static void main(String[] args) {
        System.out.println("SearchInRotatedSortedTest");
        int arr[]={16,19,21,25,3,5,8,10};
        int num = 10;
        //SearchInRotatedSorted1(arr, num);
        SearchInRotatedSorted2(arr, num);
    }

    //approach-1 linear search
    private static void SearchInRotatedSorted1(int[] arr, int num) {
        boolean found = false;
        for (int j : arr) {
            if (num == j) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("number found");
        } else {
            System.out.println("number not found");
        }
    }

    //approach-2 binary search
    private static void SearchInRotatedSorted2(int[] arr, int num) {
        int index = binarySearch(arr, 0, arr.length-1, num);
        System.out.println("number "+ num +" found at index : "+index);
    }

    private static int binarySearch(int[] arr, int start, int end, int num) {
        if(arr[start] == num){
            return start;
        }
        if(arr[end] == num){
            return end;
        }
        int mid = (start + end)/2;
        if(arr[mid] == num){
            return mid;
        }
        if(arr[mid] > arr[end] && arr[end] >= num){
            return binarySearch(arr, mid+1, end, num);
        } else {
            return binarySearch(arr, start, mid-1, num);
        }
    }
}
