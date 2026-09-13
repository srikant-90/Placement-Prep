class Solution
{
public static void main(String[] args)
{
int[] arr={10,20,30,40,50,60}
int target=60;

int left=0;
int right=arr.length-1;
int idx=-1;
while(left<=right)
{
int mid=(left+right)/2;
if(arr[mid]==target)
{
index=mid;
break;
}
else if(arr[mid]<target)
{
left=mid+1;}
else
{
right=mid-1;
}
}
System.out.println(idx);
}
}