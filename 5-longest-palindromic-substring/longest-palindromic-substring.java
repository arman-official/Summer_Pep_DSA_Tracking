class Solution {
    private int isPalindrome(int i, int j, String s,int[][] dp)
    {   

        if (i >= j) return dp[i][j]= 1;
        if(dp[i][j]!=-1)return dp[i][j];
        if (s.charAt(i) == s.charAt(j))
        {
            return dp[i][j]=isPalindrome(i+1, j-1, s,dp);
        }

        return dp[i][j]=0;
    }

    public String longestPalindrome(String s)
    {
        int n = s.length();

        int maxLen = 0, start = -1;

        int[][] dp=new int[n+1][n+1];
        for(int[] i:dp)Arrays.fill(i,-1);

        for (int i = 0; i < n; i ++)
        {
            for (int j = i; j < n; j ++)
            {
                if (isPalindrome(i, j, s,dp)==1)
                {
                    if ((j - i + 1) > maxLen)
                    {
                        maxLen = (j - i + 1);
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }
}