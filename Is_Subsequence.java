class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1,n2,j=0,l=0;
        n1=s.length();
        n2=t.length();
        if(n2>=n1)
        {
            if(s.equals(""))
                return true;
            for(int i=0;i<n1;i++)
            {
                String a;
                a=Character.toString(s.charAt(i));
                int h=0;
                if(j==0)
                    h=0;
                else
                    h=j+1;
                for(int k=h;k<n2;k++)
                {
                    if(Character.toString(t.charAt(k)).equals(a))
                    {
                        j=k;
                        l++;
                        break;
                    }
                }
            }
            if(l==n1)
                return true;
            else
                return false;
        }
        return false;
    }
}
