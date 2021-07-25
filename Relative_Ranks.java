import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer[] a=Arrays.stream( score ).boxed().toArray( Integer[]::new );
        int n=score.length;
        String s[]=new String[n];
        Arrays.sort(a, Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                s[i]="Gold Medal";
            }
            else if(i==1)
            {
                s[i]="Silver Medal";
            }
            else if(i==2)
            {
                s[i]="Bronze Medal";
            }
            else
                s[i]=Integer.toString(i+1);
        }
        for(int i=0;i<n;i++)
        {
            int x=score[i];
            for(int j=i;j<n;j++)
            {
                if(score[i]==a[j])
                {
                    int temp;
                    String swap;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    swap=s[i];
                    s[i]=s[j];
                    s[j]=swap;
                }
            }
        }
        return s;
    }
}
