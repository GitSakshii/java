import java.util.Scanner;

public class q4 {
    //sort 0 1 and 2
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int zero=0,one=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==0)zero++;
            else if(arr[i]==1)one++;
        }

        for(int i=0;i<n;i++)
        {
            if(i<zero)
            {
                arr[i]=0;
            }
            else if(i<zero+one)
            {
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
            System.out.print(arr[i]);
        }
    }
}
