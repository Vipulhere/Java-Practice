import java.util.*;
public class RotateNumberByK {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();

        int temp=n;
        int nod=0;
        while(temp>0){
            temp=temp/10;
            nod++;
        }
        //agar 5 digit ka no. hai and usse 5 se hi rotate karna hua to
        k=k%nod;
        //agar minus wale no. se rotate kare to
        if(k<0){
            k=k+nod;
        }
        int div=1;
        int mult=1;
        for(int i=1;i<=nod;i++){
            if(i<=k){
                div=div*10;
            }else{
                mult=mult*10;
            }
        }
        int q=n/div;
        int r=n%div;
        int rotate=r*mult+q;
        System.out.println(rotate);
    }
}
