import java.util.Arrays;
class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public static int longestConsecutive(int[] arr) {
        // code here
        if(arr.length==0)
        {
            return 0;
        }
        Arrays.sort(arr);
        
        int res=1,cnt=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            continue;
        
        if(arr[i]==arr[i-1]+1)
        {
            cnt++;
        }
        else{
            cnt=1;
        }
        res=Math.max(res,cnt);
        }
         return res;
    }
    
}