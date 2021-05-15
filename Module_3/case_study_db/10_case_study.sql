use furama_database;

-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, 
-- SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).

select hd.id_hop_dong,hd.ngay_lam_hop_dong,
	   hd.ngay_ket_thuc,hd.tien_dat_coc,
       count(hdct.id_hop_dong_chi_tiet)as so_luong_dich_vu_di_kem
from hop_dong hd
join hop_dong_chi_tiet hdct on hdct.id_hop_dong = hd.id_hop_dong
group by hdct.id_hop_dong
;