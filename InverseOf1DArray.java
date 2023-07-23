import java.util.Scanner;

public class InverseOf1DArray {
    public static int[] inverse(int[] arr) {
        int[] inv = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            inv[value] = i;
        }
        return inv;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int[] inverseArr = inverse(arr);
        for (int element : inverseArr) {
            System.out.print(element + " ");
        }
    }
}
