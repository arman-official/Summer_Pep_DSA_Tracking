class Solution {
    public String reverseWords(String s) {
        List<String> l=new ArrayList<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==' '){
                if(sb.length()!=0){
                    l.add(new String(sb));
                }
                sb=new StringBuffer();
            }else{
                sb.append(c);
            }
        }
        if(sb.length()>0)l.add(sb.toString());
        StringBuffer ans=new StringBuffer();
        for(int i=l.size()-1;i>=0;i--){
            ans.append(l.get(i));
            if(i>0)
            ans.append(' ');
        }
        return ans.toString();
    }
}