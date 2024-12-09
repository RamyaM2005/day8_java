import java.util.Arrays;
import java.util.Scanner;
public class MissingValuesOfCountArray 
{
  public static void main(String[] args) 
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
      //finding max
      Arrays.sort(arr);
      int max=arr[n-1];
      int c[]=new int[max+1];
      for(int i=0;i<n;i++)
      c[arr[i]]++;
      //Finding missing values
      System.out.println("missing values");
      for(int i=0;i<max+1;i++)
      {
        if(c[i]==0)
        System.out.print(i+ " ");
      }
    } 
}