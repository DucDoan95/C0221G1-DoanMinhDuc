use furama_database;

-- 22.	Thông qua khung nhìn V_NHANVIEN thực hiện cập nhật địa chỉ thành “Liên Chiểu” 
-- đối với tất cả các Nhân viên được nhìn thấy bởi khung nhìn này.

update nhan_vien  	
set nhan_vien.dia_chi = 'Liên Chiểu'
where nhan_vien.id_nhan_vien in (select v.id_nhan_vien from v_nhan_vien v)
;