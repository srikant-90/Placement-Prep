class Solution
{
static int count(String s)
{
int count=0;
String[] words=s.split(" ");
HashMap<Character,Integer> map=new HashMap<>();
for(String word:words)
{
map.put(word,map.getOrDefault(word,0)+1);
}
for(Map.Entry<Character,Integer> entry:map.entrySet())
{
if(entry.getValue()>1)
{
count++;
}
}
return count;
}