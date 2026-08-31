class Solution
{
static String longestword(String s)
{
String[] words=s.split(" ");
int maxlength=0;
String longest=" ";
for(int i=0;i<words.length;i++)
{
if(words[i].length()>maxlength)
{
maxlength=words[i].length();
longest=words[i];
}
}
return longest;
}
}