import java.util.Scanner;
//Number of occurences
public class q1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();

        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)ans++;
        }
        System.out.println("Number of occurences of "+x+":" + ans);

    }
}
