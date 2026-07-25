class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int oddInd=0;
        int evenInd=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[oddInd]=nums[i];
                oddInd+=2;
            }else{
                ans[evenInd]=nums[i];
                evenInd+=2;
            }
        }return ans;
    }
}