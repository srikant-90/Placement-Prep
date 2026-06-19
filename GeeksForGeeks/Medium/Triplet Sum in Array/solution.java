import java.util.Arrays;
class Solution {
    public static boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++)
        {
            int l=i+1,r=n-1;
            int reqsum=target-arr[i];
            while(l<r)
            {
                if(arr[l]+arr[r]==reqsum)
                {
                    return true;
                }
                if(arr[l]+arr[r]<reqsum)
                {
                    l++;
                }
                else if(arr[l]+arr[r]>reqsum)
                {
                    r--;
                }
            }
        }
        return false;
    }
}
