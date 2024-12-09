import java.util.*;
public class SumofNaturalNumbs {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int Sum=n*(n+1)/2;
        System.out.println(Sum);
        sc.close();

    }
}
