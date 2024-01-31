import java.util.Scanner;

public class b6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter index of element to be removed");
        int i=sc.nextInt();

        while(i<n-1)
        {
            arr[i]=arr[i+1];
            i++;
        }

        for(int j=0;j<n-1;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
