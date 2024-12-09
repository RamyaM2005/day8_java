import java.util.*;
public class SumIndicesForOnes {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            int temp=0;
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==1)
                {
                    temp+=(i+j);
                }
            }
            System.out.println(temp);
        }
        sc.close();

    }
    
}
