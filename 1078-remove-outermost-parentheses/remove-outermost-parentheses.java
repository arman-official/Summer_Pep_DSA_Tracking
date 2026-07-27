class Solution {
    public String removeOuterParentheses(String s) {
        int l=s.length();
        if(l<=2)return "";
        int open=1;
        StringBuffer sb=new StringBuffer();
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                open++;
                if(open>1){
                    sb.append(c);
                }
            }else{
                if(open>1){
                    sb.append(c);
                }
                open--;
            }
        }return sb.toString();
    }
}