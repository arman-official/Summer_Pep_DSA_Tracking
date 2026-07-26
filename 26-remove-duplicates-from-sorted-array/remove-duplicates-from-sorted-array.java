class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s=new HashSet<>();
        s.add(nums[0]);
        int i=1;
        int j=1;
        while(j<nums.length){
            while(j<nums.length && s.contains(nums[j])){
                j++;
            }
            if(j>=nums.length)break;
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            s.add(nums[i]);
            i++;
        }
        return i;
    }
}