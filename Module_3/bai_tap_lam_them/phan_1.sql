use internship_database;

-- 1.	Đưa ra thông tin gồm mã số, họ tên và tên khoa của tất cả các giảng viên

select i.instructor_id, i.instructor_name, f.faculty_name
from instructor i
join faculty f on i.faculty_id = f.faculty_id;

-- 2.	Đưa ra thông tin gồm mã số, họ tên và tên khoa của các giảng viên của khoa ‘DIA LY va QLTN’


select i.instructor_id, i.instructor_name, f.faculty_name
from instructor i
join faculty f on i.faculty_id = f.faculty_id
where f.faculty_name = "Dia Ly" or f.faculty_name = "QLTN" ;

-- 3.	Cho biết số sinh viên của khoa ‘CONG NGHE SINH HOC’

select count(*) as so_sv_khoa_cong_nghe_sinh_hoc
from student s
join faculty f on s.faculty_id = f.faculty_id
where f.faculty_id = "001" ; 

-- 4.	Đưa ra danh sách gồm mã số, họ tên và tuổi của các sinh viên khoa ‘TOAN

select s.student_id,s.student_name, (year(now())-year(s.date_of_birth)) as tuoi
from student s
join faculty f on s.faculty_id = f.faculty_id
where f.faculty_id = "002" ; 

-- 5.	Cho biết số giảng viên của khoa ‘CONG NGHE SINH HOC’

select count(*) as so_gv_khoa_cong_nghe_sinh_hoc
from instructor i
join faculty f on i.faculty_id = f.faculty_id
where f.faculty_id = "001" ; 

-- 6.	Cho biết thông tin về sinh viên không tham gia thực tập

select *
from student 
where student_id not in (select s.student_id 
						from student s
						join instructor_student `is`on s.student_id = `is`.student_id)
;

-- 7.	Đưa ra mã khoa, tên khoa và số giảng viên của mỗi khoa

select f.faculty_id,f.faculty_name,count(i.instructor_id) as so_giang_vien
from faculty f
join instructor i on i.faculty_id = f.faculty_id
group by f.faculty_id
;

-- 8.	Cho biết số điện thoại của khoa mà sinh viên có tên ‘Le van son’ đang theo học

select f.phone
from faculty f
join student s on s.faculty_id = f.faculty_id
where s.student_name="Le Van Son";
;