import java.util.*;
class Solution
{
public int[] twosum(int[] nums, int target)
{
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++)
{
int complement=target-nums[i];
if(map.containsKey(complement))
{
return new int[]{map.get(complement),i};
}
map.put(nums[i],i);
}
return new int[]{-1,-1};
}
  public static void main(String[] args)
  {
    Solution obj=new Solution();
    int nums={2,7,3,5,8};
    int target=9;
    int[] res=obj.twosum(nums,target);
    System.out.println("Indices:"+Arrays.toString(res));
  }
}

