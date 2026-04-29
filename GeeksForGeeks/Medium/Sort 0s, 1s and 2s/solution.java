class Solution {
    public static void sort012(int[] arr) {
        // code here
        Arrays.sort(arr);
    }
    public static void main(String[] args)
    {
        int[] arr={0,1,2,0,1,2};
        sort012(arr);
        
        for(int num:arr)
        {
            System.out.println(num+" ");
        }
    }
}