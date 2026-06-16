import java.util.HashMap;
import java.util.Map;

class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        int n=arr.length;
        int x=n/k;
        
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:arr)
            freq.put(num,freq.getOrDefault(num,0)+1);
        int count=0;
        for(Map.Entry<Integer,Integer> e:freq.entrySet())
            if(e.getValue()>x)
                count++;
        return count;
    }
}