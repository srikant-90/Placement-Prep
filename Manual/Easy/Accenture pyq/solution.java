class Solution
{
static int count(int[] A,int k)
{
int prev=-1;
int count=0;
for(int val:A)
{
if(val==0)
{
continue;
}
if(prev!=-1 && val-prev>=k)
{
count++;
}
prev=val;
}
return count;
}
}