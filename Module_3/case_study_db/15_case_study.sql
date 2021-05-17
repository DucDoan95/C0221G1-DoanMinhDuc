use furama_database;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

select nv.id_nhan_vien , nv.ho_ten , td.trinh_do , bp.ten_bo_phan , nv.sdt , nv.dia_chi
from nhan_vien nv
left join trinh_do td on td.id_trinh_do = nv.id_trinh_do
left join bo_phan bp on bp.id_bo_phan = nv.id_bo_phan
left join hop_dong hd on nv.id_nhan_vien = hd.id_nhan_vien
group by nv.id_nhan_vien
having count(hd.id_nhan_vien)<=3
;