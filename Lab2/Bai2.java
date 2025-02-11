package Lab2;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println(c == 0 ? "Phương trình vô số nghiệm." : "Phương trình vô nghiệm.");
            } else {
                System.out.printf("Nghiệm của phương trình là: x = %.2f%n", -c / b);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Phương trình có nghiệm kép: x = %.2f%n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phương trình có hai nghiệm: x1 = %.2f, x2 = %.2f%n", x1, x2);
            }
        }
        scanner.close();
    }
}
