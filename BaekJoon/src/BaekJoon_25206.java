import java.util.Scanner;

public class BaekJoon_25206 {
    public static void main(String[] main){
        Scanner scanner = new Scanner(System.in);

        float grade = 0.f; //과목 평점
        float sumGrade = 0.f; //학점들의 총합
        float sumGradeXAverage = 0.f; //학점 * 과목평점

        Loop1: for(int i = 0; i < 20; i++) {
            String input = scanner.nextLine();

            String[] buf = input.split("\\s"); //공백으로 구분

            switch (buf[2]) {
                case "A+":
                    grade = 4.5f;
                    break;
                case "A0":
                    grade = 4.0f;
                    break;
                case "B+":
                    grade = 3.5f;
                    break;
                case "B0":
                    grade = 3.0f;
                    break;
                case "C+":
                    grade = 2.5f;
                    break;
                case "C0":
                    grade = 2.0f;
                    break;
                case "D+":
                    grade = 1.5f;
                    break;
                case "D0":
                    grade = 1.0f;
                    break;
                case "F":
                    grade = 0.0f;
                    break;
                case "P":
                    break; //반복문 자체를 빠져나감
            }

            if(!buf[2].equals("P")) {
                sumGrade += Float.parseFloat(buf[1]); //학점의 총합
                sumGradeXAverage += grade * Float.parseFloat(buf[1]);//학점 * 과목평점
            }
            }
        System.out.println(sumGradeXAverage/sumGrade);
        }
    }

