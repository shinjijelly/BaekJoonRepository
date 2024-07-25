import java.util.Scanner;

public class BaekJoon_5086 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();
            String[] buf = input.split("\\s");
            int n1 = Integer.parseInt(buf[0]);
            int n2 = Integer.parseInt(buf[1]);
            if(n1 == 0 && n2 == 0){
                break;
            }
            if(n2 % n1 == 0){
                System.out.println("factor");
            }
            else if(n1 % n2 == 0){
                System.out.println("multiple");
            }
            else if((n1 % n2 != 0) && (n2 % n1 != 0)){
                System.out.println("neither");
            }
        }
    }
}
