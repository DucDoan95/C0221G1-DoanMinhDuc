use quan_ly_sinh_vien;

-- Hiển thị danh sách tất cả các học viên
select * from student;

-- Hiển thị danh sách các học viên đang theo học
select * from student where `status`=true;

-- Hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ
select * from `subject` where credit <10;

-- Hiển thị danh sách học viên lớp A1
select s.student_id,s.student_name,c.class_name
from student s 
join class c on s.class_id = c.class_id
where c.class_name="A1";

-- Hiển thị điểm môn CF của các học viên.
select s.student_id,s.student_name,sub.sub_name,m.mark
from student s
join mark m on m.student_id = s.student_id
join `subject` sub on m.sub_id = sub.sub_id
where sub.sub_name='CF';
