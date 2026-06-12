import java.util.*;
class Solution {
    public ArrayList<Integer> factorial(int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);

        for (int x = 2; x <= n; x++) {
            multiply(x, result);
        }

        Collections.reverse(result);
        return result;
         
    }
     private static void multiply(int x, ArrayList<Integer> result) {
        int carry = 0;

        for (int i = 0; i < result.size(); i++) {
            int prod = result.get(i) * x + carry;
            result.set(i, prod % 10);
            carry = prod / 10;
        }

        while (carry > 0) {
            result.add(carry % 10);
            carry /= 10;
        }
     }
}