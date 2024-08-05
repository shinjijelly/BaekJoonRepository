import java.util.Scanner;

public class BaekJoon_24267 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();

        long sum = 0;
        for(long i = 1; i < input - 1; i++){
            sum += (i * (i + 1)) / 2;
        }
        System.out.println(sum);
        System.out.println("3");
    }
}
