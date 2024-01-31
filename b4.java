import java.util.Scanner;
//Search element with binary search
public class b4 {
    public static void main(String[] args)
    {
        int eleidx=-1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int beg=0,end=n-1;
        System.out.println("Enter element to be searched");
        int ele=sc.nextInt();
        while(beg<end)
        {
            int mid=beg+end/2;
            if(arr[mid]==ele){eleidx=mid;break;}
            else if(arr[mid]<ele)
            {beg=mid;}
            else {
                end=mid-1;
            }

        }
        if(eleidx==-1) System.out.println("element not found");
        else {
            System.out.println("element is at position " +eleidx);
        }
    }
}
