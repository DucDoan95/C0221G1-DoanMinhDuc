use furama_database;

-- 25.	Tạo triggers có tên Tr_1 Xóa bản ghi trong bảng HopDong 
-- thì hiển thị tổng số lượng bản ghi còn lại có trong bảng HopDong ra giao diện console của database

delimiter //
create trigger tr_1 
	after delete 
    on hop_dong for each row
begin
set @count_hd = (select count(hd.id_hop_dong) from hop_dong hd);
 select concat("Số lượng bản ghi còn lại là: ",@count_hd) as log 
 into outfile "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/tr_1.log";
end;
// delimiter 
select * from hop_dong;
delete from hop_dong hd
where hd.id_hop_dong = 6;
