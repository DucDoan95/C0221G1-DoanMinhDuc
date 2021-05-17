use furama_database;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).

delete from khach_hang kh
where kh.id_khach_hang in (
	  select hd.id_khach_hang
      from hop_dong hd
	  where year(hd.ngay_lam_hop_dong)<2016)
;