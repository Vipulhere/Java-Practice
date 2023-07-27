import java.util.*;
public class ceilAndFloor {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int start=0;
        int end=arr.length-1;
        int target=scn.nextInt();
        int ceil=Integer.MAX_VALUE;
        int floor=Integer.MIN_VALUE;
        while(start<=end){
            int mid=(start+(end-start)/2);
            if(target>arr[mid]){
                start=mid+1;
                floor=arr[mid];
            }else if(target<arr[mid]){
                end=mid-1;
                ceil=arr[mid];
            }else{
                ceil=floor=arr[mid];
                break;
            }
        }
        System.out.println(ceil); //bada
        System.out.println(floor);
    }    
}
