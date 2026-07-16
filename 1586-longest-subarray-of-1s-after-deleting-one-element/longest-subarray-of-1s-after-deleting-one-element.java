class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int cnt=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0)cnt++;
            while(cnt>1){
                if(nums[l]==0)cnt--;
                l++;
            }
            if(cnt<=1)max=Math.max(max,r-l);
        }return max;
    }
}