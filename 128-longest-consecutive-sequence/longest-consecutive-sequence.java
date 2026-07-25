class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet();
        for(int i:nums){
            s.add(i);
        }
        // System.out.println(s.size());
        int maxcnt=0;
        for(int i=0;i<nums.length;i++){
            int currcnt=0;
            if(!s.contains(nums[i]-1) && s.contains(nums[i]+maxcnt)){
                int temp=nums[i];
                while(s.contains(temp)){
                    currcnt++;
                    temp+=1;
                }
                maxcnt=Math.max(maxcnt,currcnt);
            }
        }return maxcnt;
    }
}