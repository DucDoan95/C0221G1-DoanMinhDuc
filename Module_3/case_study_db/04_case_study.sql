use furama_database;

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select kh.ho_ten,hd.id_hop_dong,kh.id_loai_khach,count(hd.id_hop_dong) as so_lan_dat_phong 
from khach_hang kh
left join hop_dong hd on hd.id_khach_hang = kh.id_khach_hang
where kh.id_loai_khach =1
group by kh.id_khach_hang
order by so_lan_dat_phong asc
;