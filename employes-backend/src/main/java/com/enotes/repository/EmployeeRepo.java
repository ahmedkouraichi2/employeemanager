package com.enotes.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enotes.entity.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}

