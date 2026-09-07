class Solution
{
static String remove(String s)
{
HashMap<Character,Integer> map=new HashMap<>();
for(char c:s.toCharArray())
{
map.put(c,map.getOrDefault(c,0)+1);
}
StringBuilder sb=new StringBuilder();
for(char c:s.toCharArray())
{
if(map.get(c)==1)
{
sb.append(c);
}
}
return sb.toString();
}
}