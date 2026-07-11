class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int sum=prefix[n-1];
        if(sum-prefix[0]==0)return 0;
        for(int i=1;i<n;i++){
            if(prefix[i-1]==sum-prefix[i])return i;
        }
        return -1;
    }
}