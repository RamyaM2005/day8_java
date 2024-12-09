import java.util.*;
public class Mininum_elements_in_array{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=1;i<n;i++)
           a[i]=sc.nextInt();
        int max=a[1];
        for(int i=1;i<n;i++)
         {
            if(a[i]<max)
            max=a[i];
         }
System.out.println(max);
    }
}
