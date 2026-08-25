import java.util.*;
class Solution
{
public static int[] segregateElements(int[] nums)
{
int n=nums.length;
int res[]=new int[n];
int index=0;
for(int i=0;i<n;i++)
{
if(nums[i]>=0)
{
res[index++]=nums[i];
}
}
for(int i=0;i<n;i++)
{
if(nums[i]<0)
{
res[index++]=nums[i];
}
}
for(int i=0;i<n;i++)
{
nums[i]=res[i];
}
return nums;
}
}