import java.util.Scanner;

public class BaekJoon_10798 {
    public static void main(String[] args){
        String[] words = new String[5];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            words[i] = scanner.nextLine();
        }

        for(int j = 0; j < 15 ; j++){
            for(int i = 0; i < 5; i++){
                if(words[i].length() - 1 < j) continue;
                System.out.print(words[i].charAt(j));
            }
        }

    }
}

