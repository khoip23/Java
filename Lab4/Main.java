import java.util.Scanner;

class SanPham {
    private String ten;
    private double gia;
    private double giamGia;

    public SanPham(String ten, double gia, double giamGia) {
        this.ten = ten;
        this.gia = gia;
        this.giamGia = giamGia;
    }

    public SanPham(String ten, double gia) {
        this(ten, gia, 0);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    private double getThueNhapKhau() {
        return gia * 0.1;
    }

    public void xuat() {
        System.out.println("Ten san pham: " + ten);
        System.out.println("Don gia: " + gia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thong tin cho san pham 1:");
        SanPham sp1 = nhapThongTinSanPham(scanner);

        System.out.println("Nhap thong tin cho san pham 2:");
        SanPham sp2 = nhapThongTinSanPham(scanner);

        System.out.println("\nThong tin cua san pham 1:");
        sp1.xuat();

        System.out.println("\nThong tin cua san pham 2:");
        sp2.xuat();

        scanner.close();
    }

    private static SanPham nhapThongTinSanPham(Scanner scanner) {
        System.out.print("Nhap ten san pham: ");
        String ten = scanner.nextLine();

        System.out.print("Nhap don gia: ");
        double gia = scanner.nextDouble();

        System.out.print("Nhap giam gia (neu khong co nhap 0): ");
        double giamGia = scanner.nextDouble();
        scanner.nextLine();

        return new SanPham(ten, gia, giamGia);
    }
}
