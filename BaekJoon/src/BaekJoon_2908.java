import java.util.Scanner;

public class BaekJoon_2908 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //한 줄 문자열로 입력

        String[] nums = input.split("\\s"); //공백으로 구분자

        StringBuffer num1 = new StringBuffer(nums[0]);
        StringBuffer num2 = new StringBuffer(nums[1]);

        //뒤집기
        num1 = num1.reverse();
        num2 = num2.reverse();

        int integer_num1 = Integer.parseInt(num1.toString());
        int integer_num2 = Integer.parseInt(num2.toString());

        System.out.println(Math.max(integer_num1,integer_num2));
    }
}
