class Solution {
    public String largestOddNumber(String num) {
        // if(Integer.valueOf(num)%2!=0)return num;
        int ind=-1;
        for(int i=num.length()-1;i>=0;i--){
            if(Integer.valueOf(num.charAt(i))%2!=0){
                ind=i;
                break;
            }
        }
        if(ind==-1)
        return "";
        return num.substring(0,ind+1);
    }
}