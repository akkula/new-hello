package com.ex.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.bo.Employee;

public interface ProductRepository extends JpaRepository<Employee, Integer> {
 Employee findByEmail(String email);
}