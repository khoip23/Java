public class Manager extends Employee {
    private double phuCap;

    public Manager(String maEmployee, String hoTen, double luong, String chucVu, double phuCap) {
        super(maEmployee, hoTen, luong, chucVu);
        this.phuCap = phuCap;
    }

    @Override
    public double getThuNhap() {
        return super.getThuNhap() + phuCap;
    }
}