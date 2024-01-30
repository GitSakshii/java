import java.util.Scanner;

public class q3 {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            int j=sc.nextInt();
            arr[j]++;
            if(arr[j]==2)
            {
                System.out.print(j+" ");
            }
        }

    }
}
