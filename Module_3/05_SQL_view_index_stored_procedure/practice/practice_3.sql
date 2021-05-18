use classicmodels

-- TRUYỀN THAM SỐ LOẠI IN
delimiter //
create procedure get_cus_by_id
(in cusNum int(11))
begin
  select * from customers where customerNumber = cusNum;
end //
delimiter ;

call get_cus_by_id(175);

-- TRUYỀN THAM SỐ LOẠI OUT
delimiter //
create procedure get_cus_count_by_city(
in in_city varchar(50),
out total int
)
begin
  select count(customernumber)
  into total
  from customers
  where city = in_city;
end //
delimiter ;

call get_cus_count_by_city('Lyon',@total);
select @total;

-- THAM SỐ LOẠI INOUT
delimiter //
create procedure set_counter(
inout counter  int,
in inc int
)
begin
 set counter =counter+inc;
end //
delimiter ;

set @counter =1;
call set_counter(@counter,1);
call set_counter(@counter,1);
call set_counter(@counter,5);
select @counter;