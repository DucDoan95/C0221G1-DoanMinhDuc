package models;

public class KhachHangVN extends KhachHang {
    private String loaiKH;
    private String dinhMucTieuThu;

    public KhachHangVN() {
    }

    public KhachHangVN(String loaiKH, String dinhMucTieuThu) {
        this.loaiKH = loaiKH;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public KhachHangVN(String maKH, String tenKH, String loaiKH, String dinhMucTieuThu) {
        super(maKH, tenKH);
        this.loaiKH = loaiKH;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public String getDinhMucTieuThu() {
        return dinhMucTieuThu;
    }

    public void setDinhMucTieuThu(String dinhMucTieuThu) {
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    @Override
    public String toString() {
        return super.toString() +
                ","+loaiKH +
                "," + dinhMucTieuThu ;
    }
}
