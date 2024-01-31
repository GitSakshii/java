import java.util.Scanner;

public class b7 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n, m;
        System.out.println("Enter the size of arrays");
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.println("first array :");
        int []arr1=new int[n];
        int [] arr2=new int[m];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Second array:" );
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }


        int [] arr3=new int[m+n];
        int i=0,j=0,k=0;
        while(i<n&&j<m)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[k]=arr1[i];
                k++;
                i++;
            }
            else
            {
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<n)
        {
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m)
        {
            arr3[k]=arr2[j];
            j++;
            k++;

        }

        for(int l=0;l<n+m;l++)
        {
            System.out.print(arr3[l]+" ");
        }
    }


}
