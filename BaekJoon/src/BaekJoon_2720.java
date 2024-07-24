import java.util.Scanner;

public class BaekJoon_2720 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); //테스트의 개수

        for(int i = 0; i < T; i++){
            int money = scanner.nextInt();
            while(money > 0){
                System.out.print(money / 25 + " ");
                money %= 25;
                System.out.print(money / 10 + " ");
                money %= 10;
                System.out.print(money / 5 + " ");
                money %= 5;
                System.out.println(money);
                money %= 1;
            }
        }
    }
}
