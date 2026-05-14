import java.util.ArrayList;
import java.util.List;

class Solution {
     static int stockBuySell(int arr[]) {
        // code here
        
        int res=0;
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                res+=arr[i]-arr[i-1];
            }
            
        }
        
    return res;
     }       
}
