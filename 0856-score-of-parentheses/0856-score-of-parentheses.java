class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        boolean occ=false;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                occ=true;
                if(st.isEmpty()) st.push(1);
                else st.push(2*st.peek());
            }
            else{
                if(occ){
                    ans+=st.peek();
                    st.pop();
                    occ=false;
                }
                else st.pop();  
            }
        }
        return ans;
    }
}