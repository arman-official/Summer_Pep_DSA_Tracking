class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double ans=0;
       double a=Integer.MIN_VALUE;
       for(int i=0;i<k;i++){
          ans+=nums[i];
       }
    //    ans=ans/k;
       System.out.println(ans);
       a=Math.max(a,ans/k);
        for(int i=k;i<nums.length;i++){
            ans+=nums[i];
            ans-=nums[i-k];
            a=Math.max(a,ans/k);
            System.out.println(ans);
        }return a;
    }
}