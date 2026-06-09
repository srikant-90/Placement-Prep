import java.util.HashSet;
import java.util.Set;

class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        Set<Integer> sumSet =new HashSet<>();
        
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==0||sumSet.contains(sum))
            return true;
            
            sumSet.add(sum);
        }
        return false;
        
    }
}