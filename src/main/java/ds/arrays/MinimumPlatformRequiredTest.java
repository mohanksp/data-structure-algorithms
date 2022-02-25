package ds.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MinimumPlatformRequiredTest {
    public static void main(String[] args) {
        System.out.println("MinimumPlatformRequiredTest");
        int[] arrival = {100, 140, 150, 200, 215, 400};
        int[] departure = {110, 300, 220, 230, 315, 600};

        minimumPlatformRequired1(arrival, departure);
    }

    //approach-1
    private static void minimumPlatformRequired1(int[] arrival, int[] departure) {
        int[] arr = Arrays.stream(arrival).sorted().toArray();
        int[] dep = Arrays.stream(departure).sorted().toArray();

        int platform_required = 0;
        int i = 0, j = 0;
        int max = 0;
        while (i < arr.length) {
            if (arr[i] < dep[j]) {
                platform_required++;
                max = Math.max(platform_required, max);
                i++;
            } else {
                platform_required--;
                j++;
            }
        }
        System.out.println("platform required : "+max);
    }

    //approach-2
    private static void minimumPlatformRequired2(int[] arrival, int[] departure) {
        Map<String, Integer> trainDataMap = new TreeMap<>();
        int i = 0;
        for(int arr : arrival) {
            trainDataMap.put("Arrival" + i, arr);
            i++;
        }
        i =0;

        for(int dep : departure) {
            trainDataMap.put("Departure" + i, dep);
            i++;
        }
    }

}
