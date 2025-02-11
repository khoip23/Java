package Lab2;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();

        int tienDien;
        if (soDien <= 50) {
            tienDien = soDien * 1000;
        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.printf("Tiền điện phải trả: %d VNĐ%n", tienDien);
        scanner.close();
    }
}
