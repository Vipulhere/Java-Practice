import java.util.Scanner;
public class CountDigitFrequency {
    public static int getDigitFrequency(int n,int d){
        int returnValue=0;
        while(n>0){
            int dig=n%10;
            n=n/10;
            if(dig==d){
                returnValue++;
            }
        }
        return returnValue;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int d=scn.nextInt();
        int f=getDigitFrequency(n, d);
        System.out.println(f);
    }    
}
