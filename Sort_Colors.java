class Solution {
    public void sortColors(int[] a) {
           int n=a.length;
        for(int i=0,j=0,k=n;i<k;)
        {
            if(a[i]==1)
                i++;
                else
            if(a[i]==0)
            {
                if(i!=j)
                {
                int temp;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
                j++;
                i++;
            }
            else
            if(a[i]==2)
            {
                k--;
                int temp;
                temp=a[i];
                a[i]=a[k];
                a[k]=temp;
            }
            
        }
        
    }
}
