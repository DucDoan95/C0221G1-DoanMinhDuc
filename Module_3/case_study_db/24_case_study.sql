use furama_database;

delimiter //
create procedure sp_2(p_id int, p_id_nv int, p_id_kh int,p_id_dv int, p_ngay_lam_hd date,
				       p_ngay_ket_thuc date,p_tien_dat_coc double,p_tong_tien double)
begin
insert into hop_dong 
values(p_id,p_id_nv,p_id_kh,p_id_dv,p_ngay_lam_hd,p_ngay_ket_thuc,p_tien_dat_coc,p_tong_tien);
end;
// delimiter ;