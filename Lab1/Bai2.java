package Lab1;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh thứ nhất của hình chữ nhật: ");
        double canh1 = scanner.nextDouble();
        System.out.print("Nhập cạnh thứ hai của hình chữ nhật: ");
        double canh2 = scanner.nextDouble();

        double chuVi = 2 * (canh1 + canh2);
        double dienTich = canh1 * canh2;
        double canhNho = Math.min(canh1, canh2);

        System.out.printf("Chu vi: %.2f%n", chuVi);
        System.out.printf("Diện tích: %.2f%n", dienTich);
        System.out.printf("Cạnh nhỏ: %.2f%n", canhNho);
    }
}
