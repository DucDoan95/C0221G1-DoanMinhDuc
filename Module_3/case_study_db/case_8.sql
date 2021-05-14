use furama_database;

-- CÁCH 1
select khach_hang.ho_ten
from khach_hang
group by khach_hang.ho_ten;
 
-- CÁCH 2
select DISTINCT  khach_hang.ho_ten
from khach_hang ;

-- CÁCH 3
