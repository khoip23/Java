package Lab1;
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int so1 = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int so2 = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ ba: ");
        int so3 = scanner.nextInt();

        double trungBinh = (double) (so1 + so2 + so3) / 3;
        System.out.printf("Trung bình của 3 số là: %.2f%n", trungBinh);
    }
}
