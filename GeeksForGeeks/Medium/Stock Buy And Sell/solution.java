class Solution
{
static int stockBuy(int[] arr)
{
int res=0;
for(int i=1;i<arr.length;i++)
{
if(arr[i]>arr[i-1])
{
res+=arr[i]-arr[i-1];
}
}
return res;
}}
