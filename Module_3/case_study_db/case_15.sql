use furama_database;

select nv.id_nhan_vien,nv.ho_ten,td.trinh_do,bp.ten_bo_phan,nv.sdt,nv.dia_chi
from nhan_vien nv
join trinh_do td on td.id_trinh_do = nv.id_trinh_do
join bo_phan bp on bp.id_bo_phan = nv.id_bo_phan
join hop_dong hd on nv.id_nhan_vien = hd.id_nhan_vien
group by nv.ho_ten
having count(hd.id_nhan_vien)<=3