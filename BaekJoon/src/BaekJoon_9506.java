import java.util.Scanner;

public class BaekJoon_9506 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            int n = scanner.nextInt();
            if(n == -1) break; //입력 종료 조건

            int sum = 0;
            int lastNum = 0;

            for(int i = 1; i < n; i++){
                if(n % i == 0) {
                    sum += i;
                    lastNum = i;
                }
            }

            if(sum == n){
                System.out.print(n + " = ");

                for(int j = 1; j < n; j++){
                    if(n % j == 0) {
                        System.out.print(j);
                        if(j != lastNum) System.out.print(" + ");
                        if(j == lastNum) System.out.println();
                    }
                }
            }
            else{
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
