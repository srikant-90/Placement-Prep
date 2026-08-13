class Solution {
    public int missingNumber(int[] nums) {
        int sum_nums=0;

        for(int i=0; i<nums.length; i++){
            sum_nums+=nums[i];
        }

return  nums.length*(nums.length+1)/2-(sum_nums);
    }
}