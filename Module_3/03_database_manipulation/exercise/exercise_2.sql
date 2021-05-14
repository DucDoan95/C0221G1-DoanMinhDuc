use quan_ly_ban_hang;

insert into customer
values(1,"Minh Quan",10),
(2,"Ngoc Oanh",20),
(3,"Hong ha",50)
;

insert into `order`
values(1,1,"2006-3-21",null),
(2,2,"2006-3-23",null),
(3,1,"2006-3-16",null)
;

insert into product
values(1,"May Giat",3),
(2,"Tu Lanh",5),
(3,"Dieu Hoa",7),
(4,"Quat",1),
(5,"Bep Dien",2)
;

insert into order_detail
values(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3)
;

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select  o_id,o_date,o_total_price from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select customer.c_name as khach_hang_da_mua_hang,product.p_name as san_pham_da_duoc_mua_boi_cac_khach
from customer
 join `order` on `order`.c_id = customer.c_id
 join order_detail on order_detail.o_id = `order`.o_id
 join product on order_detail.p_id = product.p_id
 ;

--  Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select customer.c_name as khach_hang_khong_mua_san_pham_nao
from customer
where customer.c_id  not in (select `order`.c_id from `order`);

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. 
-- Giá bán của từng loại được tính = odQTY*pPrice)
select `order`.o_id as ma_hoa_don,`order`.o_date as ngay_ban,sum(order_detail.od_qty*product.p_price) as gia_tien_cua_tung_hoa_don
from `order`
join order_detail on order_detail.o_id = `order`.o_id
join product on order_detail.p_id = product.p_id
group by `order`.o_id