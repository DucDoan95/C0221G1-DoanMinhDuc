use furama_database;

select khach_hang.id_khach_hang,khach_hang.ho_ten,loai_khach.ten_loai_khach,hop_dong.id_hop_dong,dich_vu.ten_dich_vu,hop_dong.ngay_lam_hop_dong,hop_dong.ngay_ket_thuc, dich_vu.chi_phi_thue+dich_vu_di_kem.don_vi*dich_vu_di_kem.gia as tong_tien
from khach_hang
left join loai_khach on loai_khach.id_loai_khach = khach_hang.id_loai_khach
left join hop_dong on hop_dong.id_khach_hang = khach_hang.id_khach_hang
left join dich_vu on dich_vu.id_dich_vu = hop_dong.id_dich_vu
left join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
left join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem