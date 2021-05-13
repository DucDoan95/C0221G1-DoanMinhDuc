use furama_database;

select *from khach_hang where (((year(now())-year(ngay_sinh))>=18) and ((year(now())-year(ngay_sinh))<=50)and (dia_chi="Đà Nẵng"or dia_chi="Quảng Trị"));