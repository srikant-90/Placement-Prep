class Solution {
    int maxProduct(int arr[]) {
        // code here
          int n=arr.length;
        int minVal = arr[0];
        int maxVal = arr[0];
    
        int maxProduct = arr[0];
    
        for (int i = 1; i < n; i++)
        {
    
            
            if (arr[i] < 0)
            {
                int temp = maxVal;
                maxVal = minVal;
                minVal =temp;
            
            }
    
            
            maxVal = Math.max(arr[i], maxVal * arr[i]);
            minVal = Math.min(arr[i], minVal * arr[i]);
    
            
            maxProduct = Math.max(maxProduct, maxVal);
        }
    
        
        return maxProduct;
    }
}