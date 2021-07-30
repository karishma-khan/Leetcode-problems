class Solution {
    public boolean checkPowersOfThree(int n) {
        return check(n,0,0);
    }
    public boolean check(int n,int x,int y)
    {
        if((x+(int)Math.pow(3,y))==n)
            return true;
        else if((x+(int)Math.pow(3,y))>n)
            return false;
        else
            return(check(n,x+(int)Math.pow(3,y),y+1)||check(n,x,y+1));
    }
}
