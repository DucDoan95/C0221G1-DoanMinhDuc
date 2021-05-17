use furama_database;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.

-- CÁCH 1
-- SET FOREIGN_KEY_CHECKS=0;
delete  from nhan_vien nv
where nv.id_nhan_vien not in (
	  select hd.id_nhan_vien
	  from hop_dong hd
	  where year(ngay_lam_hop_dong) between 2017 and 2019)
;
-- SET FOREIGN_KEY_CHECKS=1;

-- CÁCH 2
-- SET FOREIGN_KEY_CHECKS=0;
-- delete FROM nhan_vien nv
-- WHERE nv.id_nhan_vien NOT IN (
--     SELECT tmp.nv_id FROM (
--         SELECT DISTINCT nhan_vien.id_nhan_vien AS nv_id
-- 		FROM nhan_vien 
-- 			INNER JOIN hop_dong ON nhan_vien.id_nhan_vien= hop_dong.id_nhan_vien
--              where year(hop_dong.ngay_lam_hop_dong) between 2017 and 2019
--     ) AS tmp
-- );
--  SET FOREIGN_KEY_CHECKS=1;