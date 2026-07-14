class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int n=nums.length;
        int sum=0;
        int len=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>target){
                if(sum>=target)
                len=Math.min(len,r-l+1);
                sum-=nums[l++];
            }
            if(sum>=target)
                len=Math.min(len,r-l+1);
            
        }return len==Integer.MAX_VALUE?0:len;
    }
}