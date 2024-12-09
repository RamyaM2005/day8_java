public class TwoD
{
    public static void main(String args[])
    {
        //Declaration
        int a[][]={{1,2},{3,4}};
        System.out.println(a[0][1]);
        System.out.println(a[1][0]);
        //Accesing
        System.out.println(a[0][0]);
        System.out.println(a[1][1]);
        //Modifying
        a[0][1]=16;
        System.out.println(a[0][1]);
    }
}