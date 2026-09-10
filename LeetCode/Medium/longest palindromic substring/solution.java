class Solution
{
static String longest(String s)
{
int maxlength=0;
int start=0;
for(int i=0;i<s.length();i++)
{
int left=i;
int right=i;
while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
{
int length=right-left+1;
if(length>maxlength)
{
maxLength=length;
start=left;
}
left--;
right++;}
left=i;
right=i+1;
while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
{
int length=right-left+1;
if(length>maxlength)
{
maxLength=length;
start=left;
}
left--;
right++;}

}
return s.substring(start,start+maxlength);
}
}
