use furama_database;

-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, 
-- TongTien (Với TongTien tính theo công thức sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select kh.id_khach_hang,kh.ho_ten,lk.ten_loai_khach,hd.id_hop_dong,dv.ten_dich_vu,hd.ngay_lam_hop_dong,
	   hd.ngay_ket_thuc, sum(dv.chi_phi_thue+hdct.so_luong*dvdk.gia) as tong_tien
from khach_hang kh
left join loai_khach lk on lk.id_loai_khach = kh.id_loai_khach
left join hop_dong hd on hd.id_khach_hang = kh.id_khach_hang
left join dich_vu dv on dv.id_dich_vu = hd.id_dich_vu
left join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
left join dich_vu_di_kem dvdk on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
group by kh.id_khach_hang,hd.id_hop_dong
;