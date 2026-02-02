package com.ayahathout.employee_service.repositories;

import com.ayahathout.employee_service.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
