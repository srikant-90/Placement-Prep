class Solution {
    public int minJumps(int[] arr) {
        // code here
        int n=arr.length;
        if(n==1)
        {
            return 0;
        }
        if(arr[0]==0)
        {
            return -1;
        }
        int jump=0;
        int pos=0;
        int des=0;
        
        for(int i=0;i<n-1;i++)
        {
            
            des=Math.max(des,arr[i]+i);
            if(pos==i)
            {
                if(des==i)
                return -1;
                pos=des;
                jump++;
            }
        }
        return jump;
    }
}