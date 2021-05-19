create database if not exists furama_database
CHARACTER SET utf8 COLLATE utf8_general_ci;
use furama_database;

create table vi_tri(
id_vi_tri int not null primary key auto_increment,
ten_vi_tri varchar(45));

create table trinh_do(
id_trinh_do int not null primary key auto_increment,
trinh_do varchar(45));

create table bo_phan(
id_bo_phan int not null primary key auto_increment,
ten_bo_phan varchar(45));

create table nhan_vien(
id_nhan_vien int not null primary key auto_increment,
ho_ten varchar(45),
id_vi_tri int not null,
id_trinh_do int not null,
id_bo_phan int not null,
foreign key (id_vi_tri) references vi_tri(id_vi_tri) ON DELETE CASCADE,
foreign key (id_trinh_do) references trinh_do(id_trinh_do) ON DELETE CASCADE,
foreign key (id_bo_phan) references bo_phan(id_bo_phan) ON DELETE CASCADE,
ngay_sinh date,
so_cmtnd varchar(45),
luong varchar(45),
sdt varchar(45),
email varchar(45),
dia_chi varchar(45));

create table loai_khach(
id_loai_khach int not null primary key auto_increment,
ten_loai_khach varchar(45));

create table khach_hang(
id_khach_hang int not null primary key auto_increment,
id_loai_khach int not null ,
foreign key (id_loai_khach) references loai_khach(id_loai_khach) ON DELETE CASCADE,
ho_ten varchar(45),
ngay_sinh date,
so_cmtnd varchar(45),
sdt varchar(45),
email varchar(45),
dia_chi varchar(45));

create table kieu_thue(
id_kieu_thue int not null primary key auto_increment,
ten_kieu_thue varchar(45),
gia int);

create table loai_dich_vu(
id_loai_dich_vu int not null primary key auto_increment,
ten_loai_dich_vu varchar(45));

create table dich_vu(
id_dich_vu int not null primary key auto_increment,
ten_dich_vu varchar(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da varchar(45),
chi_phi_thue varchar(45),
id_kieu_thue int not null,
foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue) ON DELETE CASCADE,
id_loai_dich_vu int not null,
foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu) ON DELETE CASCADE,
trang_thai varchar(45));

create table hop_dong(
id_hop_dong int not null primary key auto_increment,
id_nhan_vien int not null,
foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien) ON DELETE CASCADE, 
id_khach_hang int not null,
foreign key (id_khach_hang) references khach_hang(id_khach_hang) ON DELETE CASCADE,
id_dich_vu int not null,
foreign key (id_dich_vu) references dich_vu(id_dich_vu) ON DELETE CASCADE,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc double default 0,
tong_tien double default 0
);


create table dich_vu_di_kem(
id_dich_vu_di_kem int not null primary key auto_increment,
ten_dich_vu_di_kem varchar(45),
gia double default 0,
don_vi int default 0,
trang_thai_kha_dung varchar(45));

create table hop_dong_chi_tiet(
id_hop_dong_chi_tiet int not null primary key auto_increment,
id_hop_dong int not null,
foreign key (id_hop_dong) references hop_dong(id_hop_dong) ON DELETE CASCADE,
id_dich_vu_di_kem int not null,
foreign key (id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem) ON DELETE CASCADE,
so_luong int default 0);


-- THÊM DỮ LIỆU
insert into vi_tri(ten_vi_tri) 
values("Lễ Tân"),
("Phục Vụ"),
("Chuyên Viên"),
("Giám Sát"),
("Giám Đốc");

insert into trinh_do(trinh_do)
values("Trung Cấp"),
("Cao Đẳng"),
("Đại Học"),
("Sau Đại Học");

insert into bo_phan(ten_bo_phan) 
values("Sale – Marketing"),
("Hành Chính"),
("Phục Vụ"),
("Quản Lý");

insert into nhan_vien(ho_ten,id_vi_tri,id_trinh_do,id_bo_phan,ngay_sinh,so_cmtnd,luong,sdt,email,dia_chi)
values("Đoàn Minh Đức",5,4,4,"1995-06-05","090909090","50000000","09699999999","ducdoan@gmail.com","Dương Thưởng"),
("Đặng Anh Toàn",4,3,4,"1993-07-20","012345678","30000000","0988888888","toandang@gmail.com","Chợ Cồn"),
("Nguyễn Đức Minh",2,2,3,"1997-08-25","545454545","8000000","0977777777","ducminh@gmail.com","Quảng Nam"),
("Nguyễn Anh Tấn",3,3,2,"1980-04-15","365365365","20000000","0966666666","anhtan@gmail.com","Hòa Khánh"),
("Trần Như Tâm",3,3,2,"1985-07-05","656565656","20000000","0955555555","nhutam@gmail.com","Hòa Khánh"),
("Hoàng Thị Diệu Thúy",1,2,1,"1996-08-12","787878787","10000000","0944444444","dieuthuy@gmail.com","Sơn Trà"),
("Trần Anh Tú",5,4,4,"1995-06-05","090909090","50000000","09699999999","ducdoan@gmail.com","Dương Thưởng"),
("Nguyễn Văn Huy",5,4,4,"1990-07-15","020304050","70000000","0961231231","huyvan@gmail.com","Hải Châu");

insert into loai_khach(ten_loai_khach)
values("Diamond"),
("Platinium"),
("Gold"),
("Silver"),
("Member");

insert into khach_hang(id_loai_khach,ho_ten,ngay_sinh,so_cmtnd,sdt,email,dia_chi)
values(1,"Nguyễn Văn Tèo","1890-05-25","030604050","0936363636","vanteo@gmail.com","Phan Huy Ích"),
(1,"Trần Nguyên Vũ","1996-07-15","036587452","0966121451","nguyenvu@gmail.com","Đà Nẵng"),
(2,"Nguyễn Ngọc Lân","1991-08-26","052458755","0978458784","lannguyen@gmail.com","Quảng Trị"),
(3,"Hồ Mậu Tùng","1988-12-22","065452547","0983214512","tungho@gmail.com","Bành Văn Trân"),
(4,"Lê Văn Minh","1978-08-10","012132102","0931232121","minhvan@gmail.com","Hải Phòng"),
(1,"Huỳnh Văn Tý","1956-01-15","565423653","0933123123","tyvan@gmail.com","Nha Trang"),
(1,"Huỳnh Vũ Võ","1990-01-16","0530303542","0933123321","vuvo@gmail.com","Vinh"),
(1,"Trần Tam Khúc","1990-01-16","0530303542","0933123321","vuvo@gmail.com","Quảng Ngãi"),
(1,"Huỳnh Văn Tý","1986-02-20","527894527","0975487878","tyvanhuynh@gmail.com","Vinh");


insert into kieu_thue(ten_kieu_thue,gia)
values("Theo Năm","20000000"),
("Theo Tháng","20000000"),
("Theo Ngày","1000000"),
("Theo Giờ","200000");

insert into loai_dich_vu(ten_loai_dich_vu)
values("Villa"),
("House"),
("Room");

insert into dich_vu(ten_dich_vu,dien_tich,so_tang,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai)
values("Villa001",500,5,"20","30000000",3,2,"Trống"),
("Villa002",500,5,"20","25000000",2,2,"Đã Thuê"),
("House001",200,"3","10","10000000",3,1,"Trống"),
("House002",150,"3","10","8000000",2,2,"Trống"),
("Room001",80,"1","2","2000000",3,3,"Đã Thuê"),
("Room002",100,"1","2","500000",4,3,"Trống");

insert into hop_dong(id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,tong_tien)
values(1,1,1,"2021/12/05","2021/12/06","500000","30000000"),
(2,2,2,"2021/12/03","2021/12/10","1000000","200000000"),
(3,3,3,"2019/12/04","2019/12/07","500000","50000000"),
(4,1,3,"2019/12/04","2019/12/07","500000","50000000"),
(3,1,4,"2018/07/14","2018/07/17","1000000","70000000"),
(2,3,2,"2019/10/07","2019/10/10","500000","30000000"),
(3,4,1,"2018/09/15","2018/09/20","500000","20000000"),
(3,8,1,"2019/03/15","2019/03/20","1000000","25000000"),
(2,7,2,"2019/05/20","2019/05/21","500000","10000000"),
(1,5,2,"2015/03/15","2015/03/20","500000","20000000"),
(8,8,2,"2019/12/12","2019/12/15","500000","20000000"),
(8,8,5,"2018/12/12","2018/12/15","500000","20000000")
;

insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai_kha_dung)
values("Massage","200000","1","Khả Dụng"),
("Karaoke","80000","1","Khả Dụng"),
("Thức Ăn","100000","1","Khả Dụng"),
("Nước Uống","50000","1","Khả Dụng"),
("Thuê Xe","500000","1","Khả Dụng");

insert into hop_dong_chi_tiet(id_hop_dong,id_dich_vu_di_kem,so_luong)
values(1,1,2),
(2,5,1),
(3,3,5),
(4,2,1),
(5,3,2),
(6,1,3),
(7,2,1),
(8,1,2),
(9,3,2),
(10,2,1),
(11,2,1),
(12,2,1)
;