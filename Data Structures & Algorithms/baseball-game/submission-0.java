class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            String op = operations[i];
            if ( op.equals("+")) {
                int top1 = st.pop();
                int top2 = st.peek();
                int sum = top1 + top2;
                st.push(top1);
                st.push(sum);
            } else if (op.equals("C")) {
                st.pop();
            } else if ( op.equals("D")) {
                int dob = 2 * st.peek();
                st.push(dob);
            } else {
                st.push(Integer.parseInt(op));
            }
        }
        int score = 0;
        for (int i = 0; i < st.size(); i++) {
            score += st.get(i);
        }
        return score;
    }
}