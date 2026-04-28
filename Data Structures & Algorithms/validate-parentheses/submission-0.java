class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();

        for(int i =0; i<n; i++){
            char curr = s.charAt(i);

            if(curr == '(' || curr == '{' || curr == '['){
                st.push(curr);
            }else if( curr == ')' || curr == '}' || curr == ']'){
                if(st.isEmpty()){
                    return false;
                }

                char top = st.pop();

                if(curr == ')' && top != '('){
                    return false;
                }
                if(curr == '}' && top != '{'){
                    return false;
                }
                if(curr == ']' && top != '['){
                    return false;
                }
            } 
        }
        return st.isEmpty();
    }
}
