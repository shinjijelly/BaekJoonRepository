import java.util.Scanner;

public class BaekJoon_24313 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String f = scanner.nextLine();

        String[] fn = f.split("\\s");
        int a0 = Integer.parseInt(fn[0]);
        int a1 = Integer.parseInt(fn[1]);

        int c = scanner.nextInt();
        int n0 = scanner.nextInt();

        int check = 1;

        for(int i = n0; i <= 100; i++){
            if (a0 * i + a1 > c * i) check = 0;
        }
        System.out.println(check);
    }
}
