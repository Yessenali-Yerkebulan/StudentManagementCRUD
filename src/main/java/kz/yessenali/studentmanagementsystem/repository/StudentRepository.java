package kz.yessenali.studentmanagementsystem.repository;

import kz.yessenali.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
