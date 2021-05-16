use furama_database;

-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những 
-- Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.

select dvdk.id_dich_vu_di_kem , dvdk.ten_dich_vu_di_kem , dvdk.gia , dvdk.don_vi , dvdk.trang_thai_kha_dung
from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
join hop_dong hd on hd.id_hop_dong = hdct.id_hop_dong
join khach_hang kh on kh.id_khach_hang = hd.id_khach_hang
join loai_khach lk on lk.id_loai_khach = kh.id_loai_khach
where lk.id_loai_khach =1 and (kh.dia_chi ="Vinh"or kh.dia_chi ="Quảng Ngãi")
;