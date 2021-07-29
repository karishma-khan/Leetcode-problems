class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int x=digits[n-1];
        if(x<9)
            digits[n-1]=x+1;
        else 
        {
            int i=n-1;
            int j=0;
            while(i>-1&&digits[i]==9)
            {
                digits[i]=0;
                j++;
                i--;
            }
            if(j==n)
            {
                int dig[]=new int[n+1];
                dig[0]=1;
                for( i=1;i<n+1;i++)
                    dig[i]=0;
                return dig;
            }
            else
            {
                x=digits[i];
                digits[i]=x+1;
            }
        }
        return digits;
    }
}
