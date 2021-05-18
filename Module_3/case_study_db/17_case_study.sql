use furama_database;

-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
--  chỉ cập nhật những khách hàng đã từng đặt phòng 
--  với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.

update khach_hang
set khach_hang.id_loai_khach = 1
where khach_hang.id_khach_hang in
( select khs.id_kh from(select kh.id_khach_hang as id_kh
	from khach_hang kh
    join hop_dong hd on hd.id_khach_hang=kh.id_khach_hang
    join hop_dong_chi_tiet hdct on hdct.id_hop_dong = hd.id_hop_dong
    join dich_vu_di_kem dvdk on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
    join dich_vu dv on dv.id_dich_vu = hd.id_dich_vu
    where kh.id_loai_khach = 2
    group by hd.id_khach_hang
    having  sum(dv.chi_phi_thue+hdct.so_luong*dvdk.gia)  >10000000
    )as khs
 );