class Solution
{
static int rearrange(int[] arr)
{
Arrays.sort(arr);
int n=arr.length;
int[] res=new int[n];
int left=0;
int right=n-1;
int idx=0;
while(left<=right)
{
if(left!=right)
{
res[idx++]=arr[left++];
res[idx++]=arr[right--];
}
else
{
res[idx]=arr[left++];
}
}
for(int i=0;i<n;i++)
{
arr[i]=res[i];
}
}
}