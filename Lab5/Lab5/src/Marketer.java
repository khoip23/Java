public class Marketer extends Employee{
    private double hoaHong;
    public Marketer(String maEmployee, String hoTen, double luong, String chucVu, double hoaHong) {
        super(maEmployee, hoTen, luong, chucVu);
        this.hoaHong = hoaHong;
    }
    @Override
    public double getThuNhap() {
        return super.getThuNhap() + hoaHong; 
    }
}