import java.util.Scanner;
public class ReverseAnArray {
    public static void rev(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Original array : ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        rev(arr);
        System.out.println("After Reverse : ");
        for(int i: arr){
            System.out.print(i+" ");
        }
    } 
}   

