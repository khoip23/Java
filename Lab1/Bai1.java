package Lab1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập điểm: ");
        double diem = scanner.nextDouble();

        System.out.printf("%s %.2f điểm%n", hoTen, diem);
        scanner.close();
    }
}
