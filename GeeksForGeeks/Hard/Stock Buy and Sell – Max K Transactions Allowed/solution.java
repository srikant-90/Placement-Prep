

class Solution {
    static int maxProfit(int prices[],int k) {
        // code here
       int n=prices.length;
       if(n==0||k==0)
       {
           return 0;
       }
       
       int[] [] next=new int[k+1][2];
       for(int i = n-1;i>=0;i--){
           int[][] curr=new int[k+1][2];
           for(int trans=1;trans<=k;trans++){
               
           
               curr[trans][1]=Math.max(-prices[i]+next[trans][0],next[trans][1]);
               curr[trans][0]=Math.max(prices[i]+next[trans-1][1],next[trans][0]);
           }
           next=curr;
       }
       return next[k][1];
    }
}