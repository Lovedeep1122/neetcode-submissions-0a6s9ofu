class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash, -1);

        int l =0;
        int r =0;
        int maxi = 0;

        while(r < s.length()){
            if(hash[s.charAt(r)] >= l){
                l = Math.max(hash[s.charAt(r)]+1, l);
            }

            int len = r-l+1;

            maxi = Math.max(maxi, len);

            hash[s.charAt(r)] = r;

            r++;
        }

        return maxi;
    }
}
