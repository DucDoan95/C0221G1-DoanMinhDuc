create database if not exists furama_database CHARACTER SET utf8 COLLATE utf8_general_ci;
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
foreign key (id_vi_tri) references vi_tri(id_vi_tri),
foreign key (id_trinh_do) references trinh_do(id_trinh_do),
foreign key (id_bo_phan) references bo_phan(id_bo_phan),
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
foreign key (id_loai_khach) references loai_khach(id_loai_khach),
ho_ten varchar(45),
ngay_sinh date,
so_cmtnd varchar(45),
sdt varchar(45),
email varchar(45),
diachi varchar(45));

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
foreign key (id_kieu_thue) references kieu_thue(id_kieu_thue),
id_loai_dich_vu int not null,
foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu),
trang_thai varchar(45));

create table hop_dong(
id_hop_dong int not null primary key auto_increment,
id_nhan_vien int not null,
foreign key (id_nhan_vien) references nhan_vien(id_nhan_vien),
id_khach_hang int not null,
foreign key (id_khach_hang) references khach_hang(id_khach_hang),
id_dich_vu int not null,
foreign key (id_dich_vu) references dich_vu(id_dich_vu),
ngay_lam_hop_dong date,
ngay_key_thuc date,
tien_dat_coc int,
tong_tien int);

create table dich_vu_di_kem(
id_dich_vu_di_kem int not null primary key auto_increment,
ten_dich_vu_di_kem varchar(45),
gia int,
don_vi int,
trang_thai_kha_dung varchar(45));

create table hop_dong_chi_tiet(
id_hop_dong_chi_tiet int not null primary key auto_increment,
id_hop_dong int not null,
foreign key (id_hop_dong) references hop_dong(id_hop_dong),
id_dich_vu_di_kem int not null,
foreign key (id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem),
so_luong int);
