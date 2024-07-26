import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_3009 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int idx1 = 0, idx2 = 1;

        int[] arr = new int[6];
        for(int i = 0; i < 6; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < 2; i++) {
            if (arr[i] == arr[i + 2]) System.out.print(arr[i + 4]);
            else if (arr[i + 2] == arr[i + 4]) System.out.print(arr[i]);
            else System.out.print(arr[i + 2]);

            if(i == 0) System.out.print(" ");
        }

    }
}
