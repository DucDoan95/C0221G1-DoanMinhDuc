use furama_database;

delimiter //
create trigger tr_2 
before update 
on hop_dong for each row
begin
	if(datediff(new.ngay_ket_thuc,old.ngay_lam_hop_dong)<=2) then 
	SIGNAL SQLSTATE '02000' SET MESSAGE_TEXT = "Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày";
    end if;
end;
// delimiter ;

update hop_dong hd
set hd.ngay_ket_thuc = "2019-12-05"
where hd.id_hop_dong =4;
