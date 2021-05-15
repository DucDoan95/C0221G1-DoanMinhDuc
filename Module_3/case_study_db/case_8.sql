use furama_database;

-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên

-- CÁCH 1
select kh.ho_ten
from khach_hang kh
group by kh.ho_ten
;
 
-- CÁCH 2
select DISTINCT  kh.ho_ten
from khach_hang kh
;

-- CÁCH 3
select kh.ho_ten
from khach_hang kh
union select kh.ho_ten
	  from khach_hang kh
;