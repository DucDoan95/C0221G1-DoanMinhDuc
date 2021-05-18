use furama_database;

delimiter //
create procedure sp_1(in p_id_delete int)
begin
delete from khach_hang kh
where kh.id_khach_hang = p_id_delete;
end;
// delimiter ;
