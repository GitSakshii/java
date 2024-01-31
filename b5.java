import java.util.Scanner;

public class b5 {
    public static void main(String[] args)
    {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,min2=min,max2=max;
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<min)
            {
                min2=min;
                min=arr[i];

            }
            else if(arr[i]<min2 && arr[i]!=min)
            {
                min2=arr[i];
            }
            if(arr[i]>max)
            {
                max2=max;
                max=arr[i];

            }
            else if(arr[i]<max2 && arr[i]!=max)
            {
                max2=arr[i];
            }

        }
        System.out.println("second minimum: " +min2);
        System.out.println("second maximum: "+ max2);
    }
}
