class Solution
{
 static void reversearray(int[] arr)
{
 int left=0,right=arr.length-1;
while(left<right)
{
int temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
left++;
right--;
}
}
public static void main(String[] args)
{
int[] arr={10,20,25,30,40};
reversearray(arr);
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]+" ");
}
}}