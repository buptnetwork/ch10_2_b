package cn.edu.bupt.ch10_2_b.dao;


import cn.edu.bupt.ch10_2_b.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
