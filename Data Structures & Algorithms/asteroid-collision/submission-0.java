class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        int n = asteroids.length;

        Stack<Integer> st = new Stack<>();

        for(int i =0; i<n; i++){
            int curr = asteroids[i];

            if(curr > 0){
                st.push(curr);
            }else{
            while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(curr)){
                st.pop();
            }
            if(!st.isEmpty() && st.peek() == Math.abs(curr)){
                st.pop();
            }else if(st.isEmpty() || st.peek() < 0){
                st.push(curr);
            }
            }
        }
        int[] ans = new int[st.size()];
        for(int i =0; i< ans.length; i++){
            ans[i] = st.get(i);
        }
        return ans;
    }
}