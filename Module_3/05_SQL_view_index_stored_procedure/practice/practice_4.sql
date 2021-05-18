use classicmodels;

-- TẠO VIEW
 create view customer_views as
 select customernumber,customername,phone
 from customers;
 
 select *from customer_views;
 
 -- UPDATE VIEW
 create or replace view customer_views  as
 select customernumber, customername, contactfirstname, contactlastname, phone
 from customers
 where city = 'Nantes';
 
 -- DROP VIEW
 drop view customer_views;