class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n<=1)
        {
            return 0;
        }
        int jump=0;
        int pos=0;
        int des=0;
        for(int i=0;i<n-1;i++)
        {
            des=Math.max(des,i+nums[i]);
            if(i==pos)
            {
                 pos=des;
                jump++; 
            }
              
            
        }
        return jump;
    }
}