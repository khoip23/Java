public class Employee {
    private String maEmployee;
    private String hoTen;
    private double luong;
    private String chucVu;

    public Employee(String maEmployee, String hoTen, double luong, String chucVu) {
        this.maEmployee = maEmployee;
        this.hoTen = hoTen;
        this.luong = luong;
        this.chucVu = chucVu;
    }

    // Getter and Setter methods
    public String getMaEmployee() {
        return maEmployee;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public String getChucVu() {
        return chucVu;
    }

    // Phương thức tính thu nhập
    public double getThuNhap() {
        return this.luong;
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + maEmployee + ", Họ tên: " + hoTen + ", Lương: " + luong + ", Chức vụ: " + chucVu;
    }
}