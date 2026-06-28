import java.util.*;
class Solution {
    public ArrayList<String> permutation(String s) {
        // code here
    

        ArrayList<String> res = new ArrayList<>();
        permute("",s,res);
        Collections.sort(res);

        return res;
    }
    private static void permute(String str,String ans,ArrayList<String> res)
    {
        if(ans.length()==0)
        {
            res.add(str);
            return;
        }
        for(int i=0;i<ans.length();i++)
        {
            char ch=ans.charAt(i);
            String newPrefix=str+ch;
            String newRemaining=ans.substring(0,i)+ans.substring(i+1);
            
            // String ros=str.substring(0,i)+str.substring(i+1);
            permute(newPrefix,newRemaining,res);
        }
    }
}