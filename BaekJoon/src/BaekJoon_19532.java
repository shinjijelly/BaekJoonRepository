import java.util.Scanner;

public class BaekJoon_19532 {
    public static void main(String[] args){
        final int MAX_NUM = 999;
        final int MIN_NUM = -999;

        Scanner scanner = new Scanner(System.in);
        String[] buf = scanner.nextLine().split("\\s");
        int[] arr = new int[6];

        for(int i = 0; i < 6; i++){
            arr[i] = Integer.parseInt(buf[i]);
        }

        for(int i = MIN_NUM; i <= MAX_NUM; i++){
            for(int j = MIN_NUM; j <= MAX_NUM; j++){
                if(arr[0] * i + arr[1] * j == arr[2] && arr[3] * i + arr[4] * j == arr[5]){
                    System.out.println(i +  " " + j);
                    return;
                }
            }
        }
    }
}
