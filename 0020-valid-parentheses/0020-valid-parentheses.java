class Solution {
    public boolean isValid(String s) {
        Stack <Character> mystack= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
            {
                mystack.push(ch);
            }
            else
            {
                if(mystack.isEmpty()) return false;

                if(mystack.peek()=='(' && ch==')')
                {
                    mystack.pop();
                }
                else if(mystack.peek()=='[' && ch==']')
                {
                    mystack.pop();
                }
                else if(mystack.peek()=='{' && ch=='}')
                {
                    mystack.pop();
                }
                else
                {
                    return false;
                }
            }
            
        }
        return mystack.isEmpty();
    }
}