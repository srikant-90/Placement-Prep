class Solution
{
static String remove(String s)
{
Stack<Character> st=new Stack<>();
{
for(char c:s.toCharArray())
{
if(!st.IsEmpty() && st.peek()==c)
{
st.pop();
}
else
{
st.push(c);
}
}
StringBuilder res=new StringBuilder<>();
while(!st.IsEmpty())
{
res.append(st.pop());
}
return res.reverse().toString();
}
}