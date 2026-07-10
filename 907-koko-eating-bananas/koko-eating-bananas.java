class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int max=Arrays.stream(arr).max().getAsInt();
        int l=1,r=max;
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isValid(arr,mid,h)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }boolean isValid(int[] arr,int capacity,int h){
        long ans=0;
        for(int i:arr){
            ans+=(i+capacity-1)/capacity;
        }
        // System.out.println(capacity+" "+ans);
        return ans<=h?true:false;
    }
}