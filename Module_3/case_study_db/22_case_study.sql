use furama_database;

-- 22.	Thông qua khung nhìn V_NHANVIEN thực hiện cập nhật địa chỉ thành “Liên Chiểu” 
-- đối với tất cả các Nhân viên được nhìn thấy bởi khung nhìn này.

update v_nhan_vien 
set dia_chi = 'Liên Chiểu'
where id_nhan_vien in (v_nhan_vien.id_nhan_vien);