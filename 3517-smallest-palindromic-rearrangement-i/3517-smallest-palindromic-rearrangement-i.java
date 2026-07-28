class Solution {
    public String smallestPalindrome(String s) {
        
        int n=s.length();
        char[] firstHalf=s.substring(0,n/2).toCharArray();
        Arrays.sort(firstHalf);
        String result=new String (firstHalf) + ((n&1)==1?s.charAt(n/2):"") + new StringBuilder(new String(firstHalf)).reverse();  

        return result;
    }
}