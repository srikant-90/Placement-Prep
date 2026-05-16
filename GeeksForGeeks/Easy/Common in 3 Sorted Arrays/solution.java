import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;




class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        Map<Integer,Integer> count= new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(i==0 || a[i]!=a[i-1])
                count.put(a[i],1);
        }
        for(int i=0;i<b.length;i++)
        {
            if(i==0 || b[i]!=b[i-1])
            {
                if(count.getOrDefault(b[i],0)==1)
                    count.put(b[i],2);
            }
        }
        for(int i=0;i<c.length;i++)
        {
            if(i==0 || c[i]!=c[i-1])
            {
                if(count.getOrDefault(c[i],0)==2)
                    count.put(c[i],3);
            }
        }
        ArrayList<Integer> common=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: count.entrySet())
        {
            if(entry.getValue()==3)
                common.add(entry.getKey());
        }
        Collections.sort(common);
        
        return common;
    }
}