class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            m.put(sum,m.getOrDefault(sum,0)+1);
            sum+=nums[i];
            if(m.containsKey(sum-k))count+=m.get(sum-k);
        }return count;
    }
}