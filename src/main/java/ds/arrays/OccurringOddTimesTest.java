package ds.arrays;

import java.util.HashMap;
import java.util.Map;

public class OccurringOddTimesTest {
    public static void main(String[] args) {
        System.out.println("OccurringOddTimesTest");
        int arr[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        occurringOddTimes(arr);
    }

    private static void occurringOddTimes(int[] arr) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for (int num : arr){
            if(occurrenceMap.containsKey(num)){
                occurrenceMap.put(num, (occurrenceMap.get(num) + 1));
            } else {
                occurrenceMap.put(num, 1);
            }
        }
        occurrenceMap.forEach((k, v) -> {
            if(v % 2 == 1){
                System.out.println(k + " : "+v);
            }
        });
    }

}
