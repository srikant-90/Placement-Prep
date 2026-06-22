class Solution {
    static boolean isPalindrome(int n)
    {
        String s=Integer.toString(n);
        int len=s.length();
        for(int i=0;i<len/2;i++)
        {
            if(s.charAt(i)!=s.charAt(len-1-i))
                return false;
        }
        return true;
    }
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for(int i=0;i<arr.length;i++)
        {
            if(!isPalindrome(arr[i]))
                return false;
        }
        return true;
    }
}