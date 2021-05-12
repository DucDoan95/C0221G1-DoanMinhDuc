use furama_database;

select *from khach_hang where ((year(now())-year(ngay_sinh))>=18) and ((year(now())-year(ngay_sinh))<=50);