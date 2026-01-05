import java.util.Scanner;

public class BinaryDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  the size of an array that u want to give");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("enter the no elements ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element");
        int target=sc.nextInt();
        int result=binarySearch(arr,target);
        if(result!=-1)
        {
            System.out.println("the number is found at index"+" "+result);
        }
        else {
            System.out.println(" the number is not found at any index");
        }
    }
    public static int binarySearch(int []arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

}
