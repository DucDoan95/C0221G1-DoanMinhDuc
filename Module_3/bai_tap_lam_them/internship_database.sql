create database if not exists internship;
use internship;

create table faculty(
faculty_id int not null primary key,
faculty_name varchar(30) not null,
phone varchar(10));

create table instructor(
instructor_id int not null primary key,
instructor_name varchar(30),
salary double,
faculty_id int not null,
foreign key (faculty_id) references faculty(faculty_id)
);

create table student(
student_id int not null primary key,
student_name varchar(40) not null,
faculty_id int  not null,
foreign key (faculty_id) references faculty(faculty_id),
date_of_birth date,
place_of_birth varchar(30)
);

create table project(
project_id int not null primary key,
project_name varchar(40) not null,
expense double,
place_of_intern varchar(30)
);

create table instructor_student(
student_id int not null,
foreign key (student_id) references student(student_id),
project_id int not null,
foreign key (project_id) references project(project_id),
instructor_id int not null,
foreign key (instructor_id) references instructor(instructor_id),
grade int,
primary key (student_id,project_id,instructor_id)
);

insert into faculty
values(001,'Cong Nghe Sinh Hoc','099999999'),
(002,'Toan','099999998'),
(003,'Dia Ly','099999997'),
(004,'QLTN','099999996')
;

insert into student
values(001,'Le Van Son',001,'1991-1-1',"Quang Binh"),
(002,'Le Van Duong',002,'1992-2-2',"Quang Tri"),
(003,'Le Van Luyen',003,'1993-3-3',"Quang Nam"),
(004,'Le Van Tuyen',004,'1994-4-4',"Quang Ngai"),
(005,'Le Van Lương',004,'1995-5-5',"Quang Ngai")
;

insert into instructor
values(001,'Tran Son',20000000,001),
(002,'Tran Son',30000000,002),
(003,'Nguyen Binh Tuan',25000000,003),
(004,'Nguyen Binh Phuong',35000000,004)
;

insert into project
values(001,"Sinh Ly","2000000","Nha A"),
(002,"Toan Cao Cap","3000000","Nha B"),
(003,"Dia Cau","5000000","Que Quang Ngai"),
(004,"Moi Truong","10000000","Que Quang Nam"),
(005,"Tai Nguyen","15000000","Nha E")
;

insert into instructor_student
values(001,001,001,1),
(002,002,002,2),
(003,003,003,3),
(004,004,004,4),
(002,002,004,4),
(003,003,004,4),
(001,003,004,4),
(002,003,004,null),
(001,002,004,0)
;
