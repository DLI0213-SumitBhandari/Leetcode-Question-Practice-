class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)
        return 0;
        String s=Integer.toString(n);
        int sum=0;
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            int x=s.charAt(i)-'0';
            if(x==0)
            {
                continue;
            }else{
                s1.append(s.charAt(i)); 
                sum=sum+x;
            }
        }
        long ans = Integer.parseInt(s1.toString());
        return ans*sum;
        
    }
}