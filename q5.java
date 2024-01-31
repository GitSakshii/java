import java.util.Scanner;

public class q5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();

        int[][]arr=new int[n][n];
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
                if(i==j||i+j+1==n ||i==0||j==0||i==n-1||j==n-1)
                {
                    ans+=arr[i][j];
                }
            }

        }

        System.out.println(ans);
    }
}
