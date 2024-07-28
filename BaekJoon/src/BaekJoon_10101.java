import java.util.Scanner;

public class BaekJoon_10101 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int angleSum = 0;
        int[] angles = new int[3];

        for(int i = 0; i < 3; i++){
            angles[i] = scanner.nextInt();
            angleSum += angles[i];
        }
        if(angleSum != 180)
            System.out.println("Error");

        else if(angles[0] == 60 && angles[1] == 60 && angles[2] == 60){
            System.out.println("Equilateral");
        }
        else{
            if(angles[0] == angles[1] || angles[1] == angles[2] || angles[0] == angles[2]){
                System.out.println("Isosceles");
            }
            else System.out.println("Scalene");
        }

    }
}
