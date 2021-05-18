use furama_database;

-- 21.	Tạo khung nhìn có tên là V_NHANVIEN để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” 
-- và đã từng lập hợp đồng cho 1 hoặc nhiều Khách hàng bất kỳ  với ngày lập hợp đồng là “12/12/2019”

create view v_nhan_vien as
select nv.id_nhan_vien,nv.ho_ten,nv.id_vi_tri,nv.id_trinh_do,nv.id_bo_phan,nv.ngay_sinh,
		nv.so_cmtnd,nv.luong,nv.sdt,nv.email,nv.dia_chi
from nhan_vien nv
join hop_dong hd on hd.id_nhan_vien = nv.id_nhan_vien
where nv.dia_chi = "Hải Châu" and hd.ngay_lam_hop_dong = "2019/12/12"
;

select *from v_nhan_vien;