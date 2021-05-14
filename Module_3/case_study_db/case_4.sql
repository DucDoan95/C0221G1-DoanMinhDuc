use furama_database;

select khach_hang.ho_ten,hop_dong.id_hop_dong,khach_hang.id_loai_khach,count(hop_dong.id_hop_dong) as so_lan_dat_phong 
from khach_hang
left join hop_dong on hop_dong.id_khach_hang = khach_hang.id_khach_hang
group by khach_hang.ho_ten
having khach_hang.id_loai_khach =1
order by so_lan_dat_phong asc
;

