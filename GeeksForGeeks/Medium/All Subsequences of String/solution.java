class Solution {
    public List<String> powerSet(String s) {
        // Code here
        List<String> ans = new ArrayList<>();

               solve(s, 0, "", ans);

               Collections.sort(ans);

               return ans;
           }

           static void solve(String s, int index, String current, List<String> ans) {

               if (index == s.length()) {
                   ans.add(current);
                   return;
               }

               // Don't take the current character
               solve(s, index + 1, current, ans);

               // Take the current character
               solve(s, index + 1, current + s.charAt(index), ans);
    }
}