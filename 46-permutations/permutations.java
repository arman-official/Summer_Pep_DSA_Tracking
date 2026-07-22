class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        boolean[] b=new boolean[n];
        fun(ll,l,b,nums,0);
        return ll;
    }public void fun(List<List<Integer>> ll,List<Integer> l,boolean[] b,int[] nums,int ind){
        if(l.size()>=nums.length){
            ll.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            //pick
            if(!b[i]){
                l.add(nums[i]);
                b[i]=true;
                fun(ll,l,b,nums,i+1);
                l.remove(l.size()-1);
                b[i]=false;
                // fun(ll,l,b,nums,i+1);
            }


        }
    }
}