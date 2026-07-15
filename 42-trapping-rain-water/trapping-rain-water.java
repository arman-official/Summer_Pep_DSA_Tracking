class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int[] suffixMax=new int[n];
        int[] prefixMax=new int[n];
        int ans=0;
        suffixMax[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--){
            suffixMax[i]=Math.max(suffixMax[i+1],h[i]);
        }
        prefixMax[0]=h[0];
        for(int i=1;i<n;i++){
            prefixMax[i]=Math.max(prefixMax[i-1],h[i]);
            ans+=Math.min(suffixMax[i],prefixMax[i])-h[i];
        }
        return ans;
    }
}