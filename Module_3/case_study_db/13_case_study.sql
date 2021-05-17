use furama_database;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

select dvdk.id_dich_vu_di_kem,dvdk.ten_dich_vu_di_kem,count(hdct.id_dich_vu_di_kem) as so_lan_su_dung
from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
group by dvdk.id_dich_vu_di_kem
having count(hdct.id_dich_vu_di_kem) >= all (select count(hdct.id_dich_vu_di_kem) from dich_vu_di_kem dvdk
join hop_dong_chi_tiet hdct on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
group by dvdk.id_dich_vu_di_kem)
;