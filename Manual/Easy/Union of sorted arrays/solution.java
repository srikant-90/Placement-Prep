class Solution
{
public static ArrayList<Integer> findunion(int[] a,int[] b)
{
HashSet<Integer> set=new HashSet<>();
for(int num:a)
{
set.add(num);
}
for(int num:b)
{
set.add(num);
}
ArrayList<Integer> res=new ArrayList<>();
for(int x:set)
{
res.add(x);
}
return res;
}
public static void main(String[] args)
{
int[] a={1,2,3};
int[] b={4,5,6};
ArrayList<Integer> res=findunion(a,b);
for(int num:res)
{
System.out.println(num+"");
}
}