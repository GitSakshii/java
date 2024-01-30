import java.util.Scanner;

public class q2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ele=sc.nextInt();
        int cnt=0,lastidx=-1,firstidx=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==ele)
            {
                cnt++;
                lastidx=i;
            }

        }
        if(lastidx==-1)
        {
            System.out.println(-1 +","+ -1);
        }
        else {
            System.out.println(lastidx-cnt+1 +","+lastidx);
        }

    }
}
