use furama_database;

select nv.id_nhan_vien as id,nv.ho_ten,nv.email,nv.sdt,nv.ngay_sinh,nv.dia_chi, 1 as loai
from nhan_vien nv
union all
select kh.id_khach_hang as id,kh.ho_ten,kh.email,kh.sdt,kh.ngay_sinh,kh.dia_chi, 0 as loai
from khach_hang kh
;