use furama_database;

-- 24.	Tạo Store procedure Sp_2 Dùng để thêm mới vào bảng HopDong với yêu cầu Sp_2 
-- phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung,
-- với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.

delimiter //
create procedure sp_2(p_id int, p_id_nv int, p_id_kh int,p_id_dv int, p_ngay_lam_hd date,
				       p_ngay_ket_thuc date,p_tien_dat_coc double,p_tong_tien double)
begin
	if ((p_id in (select hd.id_hop_dong from hop_dong hd ))
		or (p_id_nv not in (select nv.id_nhan_vien from nhan_vien nv))
		or (p_id_kh) not in (select kh.id_khach_hang from khach_hang kh)
		or (p_id_dv) not in (select dv.id_dich_vu from dich_vu dv))
	 then
		begin
		SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT = 'Trùng ID Hợp Đồng or Các ID khác không hợp lệ';
		end;
	else 
		begin
		insert into hop_dong 
		values(p_id,p_id_nv,p_id_kh,p_id_dv,p_ngay_lam_hd,p_ngay_ket_thuc,p_tien_dat_coc,p_tong_tien);
		end; 
	end if;
end;
// delimiter ;
call sp_2(2,2,2,2,"2021/12/03","2021/12/10","1000000","200000000");
