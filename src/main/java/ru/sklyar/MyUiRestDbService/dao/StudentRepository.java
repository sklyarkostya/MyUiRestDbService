package ru.sklyar.MyUiRestDbService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sklyar.MyUiRestDbService.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
