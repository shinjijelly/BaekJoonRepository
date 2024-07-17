import java.util.Scanner;

public class BaekJoon_5622 {
    public static void main(String[] args){
        int sec = 0; //걸린 시간

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //문자열 입력

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) >= 'A') sec += 1;
            if(input.charAt(i) >= 'D') sec += 1;
            if(input.charAt(i) >= 'G') sec += 1;
            if(input.charAt(i) >= 'J') sec += 1;
            if(input.charAt(i) >= 'M') sec += 1;
            if(input.charAt(i) >= 'P') sec += 1;
            if(input.charAt(i) >= 'T') sec += 1;
            if(input.charAt(i) >= 'W') sec += 1;

            }
        System.out.println(sec + input.length() * 2);
        }
    }
