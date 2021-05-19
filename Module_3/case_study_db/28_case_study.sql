use furama_database;

-- 28.	Tạo Store procedure Sp_3 để tìm các dịch vụ được thuê bởi khách hàng với loại dịch vụ là “Room”
--  từ đầu năm 2015 đến hết năm 2019 để xóa thông tin của các dịch vụ đó (tức là xóa các bảng ghi trong bảng DichVu) 
--  và xóa những HopDong sử dụng dịch vụ liên quan (tức là phải xóa những bản gi trong bảng HopDong) 
--  và những bản liên quan khác.

delimiter //
create procedure sp_3()
begin
	delete from dich_vu 
    where dich_vu.id_dich_vu in (select tdv.id_dv from ( select dv.id_dich_vu as id_dv
from dich_vu dv 
join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
join khach_hang kh on kh.id_khach_hang = hd.id_khach_hang 
join nhan_vien nv on nv.id_nhan_vien = hd.id_nhan_vien
where dv.id_loai_dich_vu = 3
and (year(hd.ngay_lam_hop_dong) between 2015 and 2019)) as tdv) ;
end;
// delimiter ;

call sp_3();