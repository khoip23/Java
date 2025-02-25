import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class ASM {
    public ASM() {
    }
    protected static ArrayList<Employee> danhSachNhanVien = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("1. Nhập danh sách nhân viên");
            System.out.println("2. Xuất danh sách nhân viên");
            System.out.println("3. Tìm và hiển thị nhân viên theo mã");
            System.out.println("4. Xóa nhân viên theo mã");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã");
            System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
            System.out.println("7. Sắp xếp nhan viên theo họ tên");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao");
            System.out.println("0. Thoát.");
            System.out.println("Chọn chức năng: ");
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    nhapDanhSachNhanVien();
                    break;
                case 2:
                    xuatDanhSachNhanVien();
                    break;
                case 3:
                    timNhanVienTheoMa();
                    break;
                case 4:
                    xoaNhanVienTheoMa();
                    break;
                case 5:
                    capNhatThongTinNhanVien();
                    break;
                case 6:
                    timNhanVienTheoKhoangLuong();
                    break;
                case 7:
                    sapXepTheoHoTen();
                    break;
                case 8:
                    sapXepTheoThuNhap();
                    break;
                case 9:
                    xuat5NhanVienThuNhapCaoNhat();
                    break;
                    default:
                    System.out.println("Chọn chức năng không hợp lệ!");
            }
        } while (chon != 0);
        scanner.close();

    }
    public static void nhapDanhSachNhanVien() {
        System.out.println("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i+1));
            System.out.print("Mã nhân viên: ");
            String ma = scanner.nextLine();
            System.out.print("Họ tên: ");
            String ten = scanner.nextLine();
            System.out.print("Lương: ");
            double luong = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Chức vụ: ");
            String chucVu = scanner.nextLine();

            Employee nv = new Employee(ma, ten, luong, chucVu);
            danhSachNhanVien.add(nv);
        }
    }

    public static void xuatDanhSachNhanVien() {
        for (Employee nv : danhSachNhanVien) {
            System.out.println(nv);
        }
    }

    public static void timNhanVienTheoMa() {
        System.out.print("Nhập mã nhân viên cần tìm: ");
        String ma = scanner.nextLine();
        for (Employee nv : danhSachNhanVien) {
            if (nv.getMaEmployee().equals(ma)) {
                System.out.println(nv);
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên với mã: " + ma);
    }

    public static void xoaNhanVienTheoMa() {
        System.out.print("Nhập mã nhân viên cần xóa: ");
        String ma = scanner.nextLine();
        for (Employee nv : danhSachNhanVien) {
            if (nv.getMaEmployee().equals(ma)) {
                danhSachNhanVien.remove(nv);
                System.out.println("Đã xóa nhân viên với mã: " + ma);
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên với mã: " + ma);
    }

    public static void capNhatThongTinNhanVien() {
        System.out.print("Nhập mã nhân viên cần cập nhật: ");
        String ma = scanner.nextLine();

        for (Employee nv : danhSachNhanVien) {
            if (nv.getMaEmployee().equals(ma)) {
                System.out.println("Nhập lại thông tin nhân viên:");
                System.out.print("Họ tên: ");
                String ten = scanner.nextLine();
                System.out.print("Lương: ");
                double luong = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Chức vụ: ");
                String chucVu = scanner.nextLine();

                nv = new Employee(ma, ten, luong, chucVu);
                System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên với mã: " + ma);

    }

    public static void timNhanVienTheoKhoangLuong() {
        System.out.print("Nhập lương thấp nhất: ");
        double luongMin = scanner.nextDouble();
        System.out.print("Nhập lương cao nhất: ");
        double luongMax = scanner.nextDouble();

        System.out.println("Danh sách nhân viên có lương trong khoảng [" + luongMin + ", " + luongMax + "]:");
        boolean found = false;
        for (Employee nv : danhSachNhanVien) {
            if (nv.getLuong() >= luongMin && nv.getLuong() <= luongMax) {
                System.out.println(nv);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có nhân viên nào trong khoảng lương này.");
        }
    }
        public static void sapXepTheoHoTen () {

            danhSachNhanVien.sort(Comparator.comparing(Employee::getHoTen));
            System.out.println("Danh sách nhân viên sau khi sắp xếp theo họ và tên:");
            for (Employee nv : danhSachNhanVien) {
                System.out.println(nv);
            }
        }
    public static void sapXepTheoThuNhap() {
            danhSachNhanVien.sort(Comparator.comparingDouble(Employee::getThuNhap));
            System.out.println("Danh sách nhân viên sau khi sắp xếp theo thu nhập:");
            for (Employee nv : danhSachNhanVien) {
                System.out.println(nv);
            }
        }

    public static void xuat5NhanVienThuNhapCaoNhat() {
        ASM.danhSachNhanVien.sort((nv1, nv2) -> Double.compare(nv2.getThuNhap(), nv1.getThuNhap()));

        System.out.println("5 nhân viên có thu nhập cao nhất:");
        int count = Math.min(5, ASM.danhSachNhanVien.size());
        for (int i = 0; i < count; i++) {
            System.out.println(ASM.danhSachNhanVien.get(i));
        }
    }
}
