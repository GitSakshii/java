import java.util.Scanner;
//Print eve and odd numbers
public class b3 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("odd numbers:");
        for(int i=1;i<n;i+=2)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Even numbers:");
        for(int i=2;i<n;i+=2)
        {
            System.out.print(i+" ");
        }

    }
}
