-- Bước 1: Tạo cơ sở dữ liệu demo
	create database if not exists demo
	CHARACTER SET utf8 COLLATE utf8_general_ci;
	use demo;

-- Bước 2: Tạo bảng Products với các trường dữ liệu sau:
	create table products(
	id int auto_increment not null primary key,
	product_code int, 
	product_name varchar(50),
	product_price double,
	product_amount int,
	product_description varchar(100),
	product_status varchar(100)
	);

	insert into products
	values (1,1111,"Bánh","50000","20","Bánh Nội","Hàng Mới"),
	(2,2222,"Kẹo","10000","50","Kẹo Sữa","Hàng Mới"),
	(3,3333,"Sữa","100000","10","Sữa Tươi","Hàng Mới"),
	(4,4444,"Nước Ngọt","7000","100","Coca-Cala","Hàng Tồn"),
	(5,5555,"Bia","25000","500","Bia Heniken","Hàng Tồn")
	;

-- Bước 3:

	-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
	create unique index idx_product_code on products(product_code);

	-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
	create index idx_produc_name_price on products(product_name,product_price);

	-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
	explain select *from products where product_code = 4444;
	explain select *from products where product_name = "Bia";

	-- So sánh câu truy vấn trước và sau khi tạo index
	select *from products where product_code = 4444;
			-- (trước khi tạo type = all ; rows =5)
			-- (sau khi tạo type = const ; rows =1)
	select *from products where product_name = "Bia";
			-- (trước khi tạo type = all ; rows =5)
			-- (sau khi tạo type = ref ; rows =1)
    
-- Bước 4:

	-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
    create view products_view as
    select product_code,product_name,product_price,product_status
    from products;
    
	--   Tiến hành sửa đổi view
	create or replace view products_view as
	select product_code,product_name,product_price,product_amount,product_status
	from products
	where product_status = "Hàng Mới";

	-- Tiến hành xoá view
	drop view products_view;

-- Bước 5:
	-- 	Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
    delimiter //
    create procedure imfomation_products()
	begin
    select *from products;
    end //
    delimiter ;
	call imfomation_products();
   
	--  Tạo store procedure thêm một sản phẩm mới
	delimiter //
	create procedure add_new_product( in id int ,in `code` int,in `name` varchar(50),
		   in price double,in amount int,in `description` varchar(100),in `status` varchar(100))
	begin
	insert into products
	values (id,`code`,`name`,price,amount,`description`,`status`);
	end //
	delimiter ;
	call add_new_product(6,6666,'Rượu',20000,100,'Rượu Nếp','Hàng Mới');
    
	-- Tạo store procedure sửa thông tin sản phẩm theo id
	delimiter //
	create procedure change_info_by_id_product( in id_change int ,in `code` int,in `name` varchar(50),
		   in price double,in amount int,in `description` varchar(100),in `status` varchar(100))
	begin
	update products p
	set p.product_code=`code`,p.product_name=`name`,p.product_price=price,p.product_amount = amount,
	p.product_description=`description`,p.product_status=`status`
	where id_change = p.id;
	end //
	delimiter ;
	call change_info_by_id_product(6,6666,'Rượu Nặng',20000,100,'Rượu Nếp','Hàng Mới');
        
	-- 	Tạo store procedure xoá sản phẩm theo id
	delimiter //
	create procedure delete_product_by_id_product(in id_delete int)
	begin
	delete from products
	where products.id = id_delete;
	end //
	delimiter ; 
	call delete_product_by_id_product(6);
		