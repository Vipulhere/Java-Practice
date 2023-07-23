import java.util.Scanner;
/*
input-3
10
20
30
ouput
10 
10 20 
10 20 30 
20 
20 30 
30 
 */
public class subarrayOfArray{
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }

}