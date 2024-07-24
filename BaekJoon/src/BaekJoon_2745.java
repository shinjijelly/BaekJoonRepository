import java.util.Scanner;

public class BaekJoon_2745 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] buf = input.split("\\s");

        String N = buf[0]; //숫자, 문자가 껴있어서 String
        int B = Integer.parseInt(buf[1]); //진법

        int z = N.length() - 1; //차수
        int result = 0; //10진수로 변환한 값

        for(int i = 0; i < N.length(); i++){
            if(N.charAt(i) >= '0' && N.charAt(i) <= '9') {
                result += Math.pow(B, z) * (N.charAt(i) - '0');
            }
            else if(N.charAt(i) >= 'A' & N.charAt(i) <= 'Z'){
                result += Math.pow(B, z) * (N.charAt(i) - 'A' + 10);
            }
            z--;
        }
        System.out.println(result);

    }

}
