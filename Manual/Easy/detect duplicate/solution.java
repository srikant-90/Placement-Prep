class Solution
{
static boolean check(String s)
{
HashSet<Character> set=new HashSet<>();
for(char c:s.toCharArray())
{
if(!set.contains(c)
{
return false;
}

}
return true;
}
}