import java.util.*;
public class RotateAnArray {
    public static void RotateArray(int arr[],int k){
        int n=arr.length;
        k=k%n;
        //rev 1st part 0 to n-k-1;
        reverse(arr,0,n-k-1);
        //rev 2nd part n-k to n-1;
        reverse(arr,n-k,n-1);
        //rev entire array
        reverse(arr,0,n-1);
    }
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }    

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.print("Enter k :");
        int k=scn.nextInt();

        RotateArray(arr,k);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
