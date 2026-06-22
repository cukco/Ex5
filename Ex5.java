import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cân nặng = ");
        float width = sc.nextFloat();
        System.out.print("Chiều cao = ");
        float height = sc.nextFloat();
        System.out.printf("Chỉ số BMI = %.2f",width/(height*height));
    }
}
