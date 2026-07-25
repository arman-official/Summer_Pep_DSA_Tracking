class Solution {
    public int maxSubArray(int[] nums) {
        int ms=nums[0];
        int cs=nums[0];
        for(int i=1;i<nums.length;i++){
            if(cs<0 )cs=nums[i];
            else cs=cs+nums[i];
            ms= Math.max(cs,ms);
        }
        return ms;
    }
}