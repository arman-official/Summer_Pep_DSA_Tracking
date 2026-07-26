class Solution {
    public String removeDuplicateLetters(String st) {
        HashMap<Character,Integer> m=new HashMap<>();
        Set<Character> set=new HashSet<>();
        for(char c:st.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int size=m.size();
        Stack<Character> s=new Stack<>();
        for(char c:st.toCharArray()){
            if(!set.contains(c)){
                while(!s.isEmpty() && s.peek()>c && m.containsKey(s.peek())){
                    set.remove(s.peek());
                    s.pop();
                }
                    set.add(c);
                    s.push(c);
            }
            m.put(c,m.get(c)-1);
            if(m.get(c)==0)m.remove(c);
        }
        while(s.size()>size)s.pop();
        StringBuffer sb=new StringBuffer();
        while(!s.isEmpty())sb.append(s.pop());
        return sb.reverse().toString();
    }
}