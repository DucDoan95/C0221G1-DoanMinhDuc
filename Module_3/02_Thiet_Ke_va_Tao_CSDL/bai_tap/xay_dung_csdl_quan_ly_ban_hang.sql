create database quan_ly_ban_hang;
use quan_ly_ban_hang;

create table customer(
c_id int not null auto_increment primary key,
c_name varchar(50),
c_age int
);

create table oder(
o_id int not null auto_increment primary key,
c_id int not null,
o_date date,
o_total_price double,
foreign key (c_id) references customer(c_id)
);

create table product(
p_id int not null auto_increment primary key,
p_name varchar(50),
p_price float
);

create table order_detail(
o_id int not null,
p_id int not null,
primary key(o_id,p_id),
od_qty int,
foreign key (o_id) references oder(o_id),
foreign key (p_id) references product(p_id)
);