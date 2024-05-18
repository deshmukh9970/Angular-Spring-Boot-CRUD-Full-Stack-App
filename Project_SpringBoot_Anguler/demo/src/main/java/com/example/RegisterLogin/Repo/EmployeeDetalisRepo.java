package com.example.RegisterLogin.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.RegisterLogin.Model.EmployeeDetalis;

@EnableJpaRepositories
@Repository
public interface EmployeeDetalisRepo extends JpaRepository<EmployeeDetalis,Integer> {

}
