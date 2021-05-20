use internship;

-- 1.	Cho biết mã số và tên của các đề tài do giảng viên ‘Tran son’ hướng dẫn

select p.project_id,p.project_name
from project p
join instructor_student `is` on `is`.project_id = p.project_id
join instructor i on i.instructor_id = `is`.instructor_id
where i.instructor_name = "Tran Son"
group by p.project_id
;

-- 2.	Cho biết tên đề tài không có sinh viên nào thực tập

select p.project_name
from project p
left join instructor_student `is` on `is`.project_id = p.project_id
left join student s on s.student_id = `is`.student_id
group by p.project_id
having count(s.student_id)=0
;
-- 3.	Cho biết mã số, họ tên, tên khoa của các giảng viên hướng dẫn từ 3 sinh viên trở lên.

select i.instructor_id,i.instructor_name,f.faculty_name
from instructor i
join faculty f on f.faculty_id = i.faculty_id
join instructor_student `is` on `is`.instructor_id = i.instructor_id
join student s on s.student_id = `is`.student_id
group by i.instructor_id
having count(s.student_id)>=3
;

-- 4.	Cho biết mã số, tên đề tài của đề tài có kinh phí cao nhất

select p.project_id,p.project_name
from project p
where p.expense = all(select max(expense) from project)
;
-- 5.	Cho biết mã số và tên các đề tài có nhiều hơn 2 sinh viên tham gia thực tập

select p.project_id,p.project_name
from project p
left join instructor_student `is` on `is`.project_id = p.project_id
left join student s on s.student_id = `is`.student_id
group by p.project_id
having count(s.student_id)>2
;

-- 6.	Đưa ra mã số, họ tên và điểm của các sinh viên khoa ‘DIALY và QLTN’

select s.student_id,s.student_name,`is`.grade
from student s
join instructor_student `is` on `is`.student_id = s.student_id
where s.faculty_id in(3,4)
;

-- 7.	Đưa ra tên khoa, số lượng sinh viên của mỗi khoa

select f.faculty_name,count(s.student_id) as so_luong_sinh_vien
from faculty f
join student s on s.faculty_id = f.faculty_id
group by f.faculty_id
;

-- 8.	Cho biết thông tin về các sinh viên thực tập tại quê nhà

select s.student_id,s.student_name,s.faculty_id,s.date_of_birth,s.place_of_birth
from student s
join instructor_student `is` on `is`.student_id = s.student_id
join project p on `is`.project_id = p.project_id
where p.place_of_intern like "Que%"
group by s.student_id
;


-- 9.	Hãy cho biết thông tin về những sinh viên chưa có điểm thực tập

select s.student_id,s.student_name
from student s
join instructor_student `is` on `is`.student_id = s.student_id
where `is`.grade is null
group by s.student_id
;

-- 10.	 Đưa ra danh sách gồm mã số, họ tên các sinh viên có điểm thực tập bằng 0

select s.student_id,s.student_name
from student s
join instructor_student `is` on `is`.student_id = s.student_id
where `is`.grade = 0
group by s.student_id
;
