class Solution {
    public static void mergeArrays(int a[], int b[]) {
        // code here
        int n=a.length;
        int m=b.length;
        
        int[] mrgd=new int[n+m];
        
        for(int i = 0;i<n;i++)
        {
            mrgd[i]=a[i];
        }
        for(int j = 0;j<m;j++)
        {
            mrgd[n+j]=b[j];
        }
        Arrays.sort(mrgd);
        for(int i= 0;i<n;i++)
        {
            a[i]=mrgd[i];
        }
        for(int j = 0;j<m;j++)
        {
            b[j]=mrgd[n+j];
        }
        
    }
    public static void main(String[] args)
    {
        int a[]={1,2,3};
        int b[]={4,5,6};
        
        mergeArrays(a,b);
        for(int num:a)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        for(int num:b)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
