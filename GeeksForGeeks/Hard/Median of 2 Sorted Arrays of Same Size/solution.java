import java.util.Arrays;

class Solution {
    public static double medianOf2(int a[], int b[]) {
        // Your Code Here
        int c[]=new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        Arrays.sort(c);
        
        int n=c.length;
        int mid1=n/2;
        int mid2=mid1-1;
        return (c[mid1]+c[mid2])/2.0;
    }
}