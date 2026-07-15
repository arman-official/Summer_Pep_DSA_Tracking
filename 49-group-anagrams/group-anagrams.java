class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String ss=new String(ch);
            if(!m.containsKey(ss)){
                m.put(ss,new ArrayList<>());
            }
            m.get(ss).add(s);
        }
        List<List<String>> ans= new ArrayList<>(m.values());
        return ans;
    }
}