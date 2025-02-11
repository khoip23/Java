package Lab1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double canDelta = Math.sqrt(delta);

        System.out.printf("Delta: %.2f%n", delta);
        if (delta >= 0) {
            System.out.printf("Căn Delta: %.2f%n", canDelta);
        } else {
            System.out.println("Delta âm, không có căn Delta.");
        }
        scanner.close();
    }
}
