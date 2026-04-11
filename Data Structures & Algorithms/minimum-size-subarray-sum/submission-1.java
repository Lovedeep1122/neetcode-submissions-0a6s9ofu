class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l =0;
        int r =0;
        int maxlen = Integer.MAX_VALUE;
        

       
        for(int i =0; i<n; i++){
            int sum =0;
            for(int j =i; j<n; j++){
                sum += nums[j];
                 if(sum >= target){
                maxlen = Math.min(maxlen , j-i+1 );
            }
            }
           
        }
        if(maxlen > 1000000){
            maxlen = 0;
        }
        return maxlen;
    }
}