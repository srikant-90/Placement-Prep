import java.util.*;
class Solution
{
static int sum(int[] arr,int target)
{
Arrays.sort(arr);
int count=0;
for(int i=0;i<arr.length-2;i++)
{
int left=i+1;
int right=arr.length-1;
while(left<right)
{
int sum=arr[i]+arr[left]+arr[right];
if(sum<target)
{
count+=right-left;
left++;}
else
{
right--;
}
}
}
return count;}
public static void main(String[] args)
{
int[] arr={0,-1,2,5,-3,7,5};
int target=12;
System.out.println(sum(arr,target));
}
}
