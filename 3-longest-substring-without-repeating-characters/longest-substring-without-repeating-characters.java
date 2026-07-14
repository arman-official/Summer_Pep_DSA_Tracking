class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        HashMap<Character,Integer> m=new HashMap<>();
        int ans=0;
        for(int r=0;r<s.length();r++){
            m.put(s.charAt(r),m.getOrDefault(s.charAt(r),0)+1);
            while(r-l+1>m.size()){
                m.put(s.charAt(l),m.get(s.charAt(l))-1);
                if(m.get(s.charAt(l))==0)m.remove(s.charAt(l));
                l++;
            }ans=Math.max(ans,r-l+1);

        }return ans;
    }
}