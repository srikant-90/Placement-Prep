import java.util.*;

class Solution {
    public static int[] segregateElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int index = 0;

        // Step 1: non-negative elements (IMPORTANT: includes 0)
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                res[index++] = arr[i];
            }
        }

        // Step 2: negative elements
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                res[index++] = arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=res[i];
        }

        return res;
    }
}