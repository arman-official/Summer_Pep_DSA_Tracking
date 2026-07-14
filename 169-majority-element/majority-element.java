class Solution {
    public int majorityElement(int[] nums) {
        int ele=nums[0];
        int cnt=1;
        int ind=1;
        while( ind<nums.length){
            if(nums[ind]!=ele){
                cnt--;
            }else{
                cnt++;
            }
            if(cnt<0){
                cnt=1;
                ele=nums[ind];
            }
            ind++;
        }return ele;
    }
}