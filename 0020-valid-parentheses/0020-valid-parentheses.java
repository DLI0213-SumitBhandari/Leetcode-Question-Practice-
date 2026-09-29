class Solution {
    public boolean isValid(String s) {

        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{')
            {
                st.push('{');
                continue;
            }
            else if(s.charAt(i)=='(')
            {
                st.push('(');
                continue;
            }
            else if(s.charAt(i)=='[')
            {
                st.push('[');
                continue;
            } 
            else if(s.charAt(i)==')'&& !st.isEmpty() && st.peek()=='(')
            {
                st.pop();
                continue;
            }
             else if(s.charAt(i)=='}'&& !st.isEmpty() && st.peek()=='{')
            {
                st.pop();
                continue;
            }
             else if(s.charAt(i)==']'&& !st.isEmpty() && st.peek()=='[')
            {
                st.pop();
                continue;
            }else
            {
                return false;
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        
        return false;
     
        
    }
}
