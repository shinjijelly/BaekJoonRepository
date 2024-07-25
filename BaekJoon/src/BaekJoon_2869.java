import java.util.Scanner;

public class BaekJoon_2869 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] buf = input.split("\\s");
        double A = Double.parseDouble(buf[0]); //낮에 올라가는 미터
        double B = Double.parseDouble(buf[1]); //밤에 미끄러지는 미터
        double V = Double.parseDouble(buf[2]); //막대의 높이

        int day = 0; //걸린 일수

        day = (int)Math.ceil((V - B) / (A - B));
        System.out.println(day);
    }
}
