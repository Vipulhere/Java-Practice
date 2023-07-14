// import java.util.Scanner;
// public class factorialFunction {
//     public static int fact(int x){
//         int returnValue=1;
//         for(int i=1;i<=x;i++){
//             returnValue=returnValue*i;
//         }
//         return returnValue;
//     }
//     public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         System.out.println("Enter n ");
//         int n=scn.nextInt();
//         System.out.println("Enter r ");
//         int r=scn.nextInt();

//         int nfact=fact(n);
//         int nfactMinusr=fact(n-r);

//         int npr=nfact/nfactMinusr;
//         System.out.println(n+"P"+r+"="+npr);
//     }    
// }


import java.util.Scanner;
public class factorialFunction {

    public static void display(int n,int r,int npr){
        System.out.println(n+"P"+r+"="+npr);
    }

    public static int fact(int x){
        int returnValue=1;
        for(int i=1;i<=x;i++){
            returnValue=returnValue*i;
        }
        return returnValue;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter n ");
        int n=scn.nextInt();
        System.out.println("Enter r ");
        int r=scn.nextInt();

        int nfact=fact(n);
        int nfactMinusr=fact(n-r);

        int npr=nfact/nfactMinusr;
        display(n,r,npr);
    }    
}
