class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        if(n==1)return true;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1)return true;
        reverse(nums,0,ind);
        reverse(nums,ind+1,n-1);
        reverse(nums,0,n-1);
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1])return false;
        }
        return true;
    }public void reverse(int[] nums,int i,int j){
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }
}