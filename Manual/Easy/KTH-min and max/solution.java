class Solution
{
public static void main(String[] args)
{
int[] arr={10,20,5,2,15};
int k=4;
Arrays.sort(arr);
int kthsmallest=arr[k-1];
int kthmaximum=arr[arr.length-k];
System.out.println(kthsmallest);
System.out.println(kthmaximum);
}
}