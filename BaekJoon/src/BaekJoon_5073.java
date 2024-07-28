
import java.util.Scanner;

public class BaekJoon_5073 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] n = new int[3];
        int max = 0;

        while(true) {
            String input = scanner.nextLine();
            String[] buf = input.split("\\s");

            for(int i = 0; i < 3; i++){
                n[i] = Integer.parseInt(buf[i]);
            }

            if (n[0] == 0 && n[1] == 0 && n[2] == 0)
                break; // 종료조건

            int idx = 0;
            for(int i = 0; i < 3; i++){
                if(n[i] > max) {
                    max = n[i];
                    idx = i;
                }
            }

            for(int i = 0; i < 3; i++){
                if(idx != i){
                    max -= n[i];
                }
            }
            if(max < 0) {
                if (n[0] == n[1] && n[1] == n[2]) {
                    System.out.println("Equilateral");
                } else if (n[0] == n[1] || n[1] == n[2] || n[0] == n[2]) {
                    System.out.println("Isosceles");
                } else
                    System.out.println("Scalene");
            }
            else System.out.println("Invalid");
        }
    }
}
