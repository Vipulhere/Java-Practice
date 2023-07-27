import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter data that you want to search ");
        int data=scn.nextInt();
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(data>arr[mid]){
                low=mid+1;
            }else if(data<arr[mid]){
                high=mid-1;
            }else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println("Data Not Found");
    }
}
