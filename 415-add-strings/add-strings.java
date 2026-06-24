import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        // int n=Integer.parseInt(num1);
        // int n2=Integer.parseInt(num2);
        // return String.valueOf(n+n2);
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        return a.add(b).toString();

    }
}