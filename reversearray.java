import java.util.*;
class reversearray{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
        int l=0;
        int r=n-1;
        
        while(l<=r)
        {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;

        }
        
        System.out.println(Arrays.toString(arr));
    }
}