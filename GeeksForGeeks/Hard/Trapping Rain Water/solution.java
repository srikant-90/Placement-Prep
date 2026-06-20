class Solution {
    public  static int maxWater(int arr[]) {
        // code here
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        
        int res=0;
        left[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],arr[i]);
        }
        for(int i=1;i<n-1;i++)
        {
            int minarr=Math.min(left[i],right[i]);
            res+=minarr-arr[i];
        }
        return res;
    }
}
