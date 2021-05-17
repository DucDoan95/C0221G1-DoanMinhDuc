use furama_database;

-- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
--  chỉ cập nhật những khách hàng đã từng đặt phòng 
--  với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.

update khach_hang
set khach_hang.id_loai_khach = 1
where khach_hang.id_khach_hang in
( select kh.id_kh from(select khach_hang.id_khach_hang as id_kh
	from khach_hang 
    join hop_dong on hop_dong.id_khach_hang=khach_hang.id_khach_hang
    where khach_hang.id_loai_khach = 2
    group by khach_hang.id_loai_khach,hop_dong.id_khach_hang
    having sum(hop_dong.tong_tien) >10000000
    )as kh
 );