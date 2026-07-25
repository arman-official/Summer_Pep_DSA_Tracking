class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] upto=new int[n];
        upto[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            upto[i]=Math.max(upto[i+1],prices[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,upto[i]-prices[i]);
        }
        return ans;
    }
}