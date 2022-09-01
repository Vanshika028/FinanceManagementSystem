package com.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finance.model.AdminLogin;

@Repository
public interface AdminLoginRepository extends JpaRepository< AdminLogin , Long> {
 public AdminLogin findUserByAname(String aname);
}
