 class Solution
{
public static ArrayList<Integer> getminmax(int[] arr)
{
int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
for(int num:arr)
{
if(num<min)min=num;
if(num>max)max=num;
}
ArrayList<Integer> result= new ArrayList<>();
result.add(min);
result.add(max);
return result;
}
public static void main(String[] args)
{
int[] arr={10,5,20,3};
ArrayList<Integer> result=getminmax(arr);
System.out.println(result.get(0)+" "+result.get(1));
}