package models;

public class KhachHangNN extends KhachHang {
    private String quocTich;

    public KhachHangNN() {
    }

    public KhachHangNN(String quocTich) {
        this.quocTich = quocTich;
    }

    public KhachHangNN(String maKH, String tenKH, String quocTich) {
        super(maKH, tenKH);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return super.toString()+
                ","+ quocTich;
    }
}
