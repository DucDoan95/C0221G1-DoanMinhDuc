use quan_ly_sinh_vien;

-- Hiển thị số lượng sinh viên ở từng nơi
select address, COUNT(student_id) as so_luong_hoc_vien
from student
group by address
;

-- Tính điểm trung bình các môn học của mỗi học viên
select s.student_id,s.student_name, avg(m.mark)
from student s join mark m on s.student_id = m.student_id
group by s.student_id, s.student_name;

-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
select s.student_id,s.student_name, avg(m.mark)
from student s join mark m on s.student_id = m.student_id
group by  s.student_id,s.student_name
having avg(m.mark) > 15;

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
select s.student_id, s.student_name, avg(m.mark)
from student s join mark  m on s.student_id = m.student_id
group by s.student_id, s.student_name
having avg(m.mark) >= all (select avg(m.mark) from mark m group by m.student_id);
