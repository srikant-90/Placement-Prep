class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
       HashSet<Integer> st=new HashSet<>();
       for(int num:a)
       
           st.add(num);
       
       for(int num:b)
           st.add(num);
       
       ArrayList<Integer> res=new ArrayList<> ();
       
       for(int it:st)
       
           res.add(it);
       
       return res;
    } 
       public static void main(String[] args)
       {
           int[] a={1,2,3};
           int[] b={4,5,6};
           
           ArrayList<Integer> res=findUnion(a,b);
           
           for(int num:res)
           {
               System.out.println(num+" ");
           }
       }
}