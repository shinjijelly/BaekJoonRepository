import java.util.Scanner;

public class BaekJoon_10988 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int check = 1;
        for(int i = 0; i < input.length() / 2; i++){
            if(input.charAt(i) != input.charAt(input.length() - i - 1))
                check = 0;
        }

        System.out.println(check);
    }
}
