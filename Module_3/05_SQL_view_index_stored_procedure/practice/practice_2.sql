use classicmodels;

-- TẠO Stored Procedure
delimiter //
create procedure findAllCustomers()

begin

  select * from customers;

end //

delimiter ;

-- GỌI PROCEDURE
call findAllCustomers();

-- XÓA PROCEDURE
DELIMITER //
drop procedure if exists `findAllCustomers`//

DELIMITER //
create procedure findAllCustomers()

begin
select * from customers where customerNumber = 175;

end //
