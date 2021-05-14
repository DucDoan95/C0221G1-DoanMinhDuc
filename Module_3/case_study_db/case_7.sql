use furama_database;

select dv.id_dich_vu,dv.ten_dich_vu,dv.dien_tich,dv.so_nguoi_toi_da,dv.chi_phi_thue,ldv.ten_loai_dich_vu
from dich_vu dv
join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
join hop_dong hd on hd.id_dich_vu = dv.id_dich_vu
where (year(hd.ngay_lam_hop_dong)=2018) and 
hd.id_dich_vu not in (select hd.id_dich_vu from hop_dong where (year(hd.ngay_lam_hop_dong)=2019))
;
