class Solution {
    public int removeDuplicates(int[] nums) {
      int n = nums.length;
        int unique = nums[0];

        int cnt = 1;

        for(int i =1; i<n; i++){
            if(nums[i] != unique){
              
              unique = nums[i];
              cnt++;
            }else{
                int l = i;
                
                while(l <n-1){
                    int temp = nums[l];
                    nums[l] = nums[l+1];
                    nums[l+1] = temp;
                    l++;           
                         }
                        i--;
                        n--;
            }
            
        }
        return cnt;
    }
}