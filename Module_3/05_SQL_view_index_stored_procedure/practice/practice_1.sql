use classicmodels;

select * from customers where customername='Land of Toys Inc.';
-- 	CÚ PHÁP KIỂM TRA QUERY
explain select * from customers where customername='Land of Toys Inc.';

-- CÚ PHÁP THÊM CHỈ MỤC
alter table customers add index idx_customer_name(customerName);
explain select * from customers where customername='Land of Toys Inc.';

-- CÚ PHÁP ADD INDEX THEO CẶP
alter table customers add index idx_full_name(contactFirstName,contactLastName);
explain select *from customers where contactFirstName ='Jean' or contactFirstName='King';

-- CÚ PHÁP XÓA CHỈ MỤC
alter table customers drop index idx_full_name;