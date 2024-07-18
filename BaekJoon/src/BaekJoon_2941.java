import java.util.Scanner;

public class BaekJoon_2941 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if((i + 1 < str.length()) && (str.substring(i, i + 2).equals("c="))){
                count++; i++;
                //System.out.println("c=");
            }
            else if((i + 1 < str.length()) && (str.substring(i, i + 2).equals("c-"))){
                count++; i++;
                //System.out.println("c-");
            }
            else if((i + 2 < str.length()) && (str.substring(i, i + 3).equals("dz="))){
                count++; i += 2;
                //System.out.println("dz=");
            }
            else if((i + 1 < str.length()) && (str.substring(i, i + 2).equals("d-"))){
                count++; i++;
                //System.out.println("d-");
            }
            else if((i + 1 < str.length()) && (str.substring(i, i + 2).equals("lj"))){
                count++; i++;
                //System.out.println("lj");
            }
            else if((i + 1 < str.length()) && (str.substring(i, i + 2).equals("nj"))){
                count++; i++;
                //System.out.println("nj");
            }
            else if((i + 1 < str.length()) && (str.substring(i, i + 2).equals("s="))){
                count++; i++;
                //System.out.println("s=");
            }
            else if((i + 1 < str.length()) && (str.substring(i, i + 2).equals("z="))){
                count++; i++;
                //System.out.println("z=");
            }
            else {
                count++;
                //System.out.println("else");
            }
        }
        System.out.println(count);
    }
}
