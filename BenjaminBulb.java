import java.util.*;
public class BenjaminBulb {
    public static void main(String[] args) {
        /* 
        trick to solve this question that- non perfect sq chalega 2n tak
        perfect sq-2n+1 tak
        so we just have to print all the perfect sq. numbers
        */ 

        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();

        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
        
    }
}
