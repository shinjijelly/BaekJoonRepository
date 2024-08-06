import java.util.Scanner;

public class BaekJoon_2587 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        double sum = 0;

        for(int i = 0; i < 5; i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(arr[i] < arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println((int)(sum / 5));
        System.out.println(arr[2]);
    }
}
