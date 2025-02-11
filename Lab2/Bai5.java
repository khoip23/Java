package Lab2;
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số c: ");
        int c = scanner.nextInt();

        int max = Math.max(a, Math.max(b, c));
        System.out.printf("Số lớn nhất là: %d%n", max);
        scanner.close();
    }
}
