use furama_database;

-- Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang,
--  TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), 
--  TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 
--  nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.


select hd.id_hop_dong,nv.ho_ten,kh.ho_ten,kh.sdt,dv.ten_dich_vu,count(hdct.id_hop_dong_chi_tiet) as so_luong_dich_vu_di_kem, hd.tien_dat_coc
from hop_dong hd
join nhan_vien nv on nv.id_nhan_vien = hd.id_nhan_vien
join khach_hang kh on kh.id_khach_hang = hd.id_khach_hang
join dich_vu dv on dv.id_dich_vu = hd.id_dich_vu
join hop_dong_chi_tiet hdct on hdct.id_hop_dong = hd.id_hop_dong
where ((month(hd.ngay_lam_hop_dong) in (10,11,12)) and year(hd.ngay_lam_hop_dong)=2019 )and 
hd.id_dich_vu not in (select hd.id_dich_vu from hop_dong where (month(hd.ngay_lam_hop_dong) in(1,2,3,4,5,6)) and year(hd.ngay_lam_hop_dong)=2019 )
group by hdct.id_hop_dong_chi_tiet
;