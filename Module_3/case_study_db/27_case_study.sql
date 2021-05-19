use furama_database;

-- a.	Tạo user function func_1: Đếm các dịch vụ đã được sử dụng với Tổng tiền là > 2.000.000 VNĐ.

delimiter //
create function func_1()
returns int
deterministic
begin
	declare count_dv int;
    set count_dv = (select count(dv.id_dich_vu) 
		from dich_vu dv
		where id_dich_vu in (
		select dv.id_dich_vu
		from hop_dong hd
		 join dich_vu dv on dv.id_dich_vu = hd.id_dich_vu
		 join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
		 join dich_vu_di_kem dvdk on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
		group by hd.id_dich_vu
		having sum(dv.chi_phi_thue+hdct.so_luong*dvdk.gia)>2000000));
	return count_dv;
end;
// delimiter ;

select func_1();


-- b.	Tạo user function Func_2: Tính khoảng thời gian dài nhất tính từ lúc bắt đầu làm hợp đồng
-- đến lúc kết thúc hợp đồng mà Khách hàng đã thực hiện thuê dịch vụ 
-- (lưu ý chỉ xét các khoảng thời gian dựa vào từng lần làm hợp đồng thuê dịch vụ, 
-- không xét trên toàn bộ các lần làm hợp đồng). Mã của Khách hàng được truyền vào như là 1 tham số của function này)

delimiter //
create function func_2(p_id_khach_hang int)
returns int
deterministic
begin
	declare max_time int;
    set max_time = (select max(`time`)
			from (select datediff(hd.ngay_ket_thuc,hd.ngay_lam_hop_dong) as `time` 
				 from hop_dong hd 
				 where hd.id_khach_hang = p_id_khach_hang)
			as tg);
	return max_time;
end;
// delimiter ;

select func_2(1);