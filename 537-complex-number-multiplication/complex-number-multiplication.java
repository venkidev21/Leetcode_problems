class Solution {
    public String complexNumberMultiply(String num1, String num2) {
       String s1[]=num1.split("\\+");
       String s2[]= num2.split("\\+");
       int a=Integer.valueOf(s1[0]);
       int b=Integer.valueOf(s1[1].substring(0,s1[1].length()-1));
       int c=Integer.valueOf(s2[0]);
       int d=Integer.valueOf(s2[1].substring(0,s2[1].length()-1));
    return (a*c-b*d)+"+"+(a*d+b*c)+"i";
    }
}