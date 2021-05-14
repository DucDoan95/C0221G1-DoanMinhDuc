use furama_database;

select month(hd.ngay_lam_hop_dong) as thang, sum(dv.chi_phi_thue+dvdk.don_vi*dvdk.gia) as doanh_thu, count(hd.id_khach_hang) as so_luong_khach_hang
from hop_dong hd
left join dich_vu dv on dv.id_dich_vu = hd.id_dich_vu
left join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
left join dich_vu_di_kem dvdk on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
where  year(hd.ngay_lam_hop_dong)=2019
 group by thang