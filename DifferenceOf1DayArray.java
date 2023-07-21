import java.util.Scanner;
public class DifferenceOf1DayArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=scn.nextInt();
        }

        int diff[]=new int[n2];
        int carry=0;

        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=diff.length-1;

        while(k>=0){
            int digit=0;
            int arr1value=i>=0?arr1[i]:0;
            if(arr2[j]+carry>=arr1value){
                digit=arr2[j]+carry-arr1value;
                carry=0;
            }else{
                digit=arr2[j]+carry+10-arr1value;
                carry=-1;
            }
            diff[k]=digit;
            i--;
            j--;
            k--;
        }
        int index=0;
        while(index<diff.length){
            if(diff[index]==0){
                index++;
            }else{
                break;
            }
        }
        while(index<diff.length){
            System.out.print(diff[index]);
            index++;
        }
    }
}
