class Solution {
    int floorSqrt(int n) {
        // code here
        int lo = 1, hi = n;
               int res = 1;

               while (lo <= hi) {
                   int mid = lo + (hi - lo) / 2;

                   
                  if (mid * mid <= n){
                       res = mid;
                       lo = mid + 1;
                   }

                   
                   else {
                       hi = mid - 1;
                   }
               }

               return res;
    }
}