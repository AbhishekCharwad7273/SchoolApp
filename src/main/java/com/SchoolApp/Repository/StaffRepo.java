package com.SchoolApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolApp.Entity.Staff;


public interface StaffRepo extends JpaRepository<Staff, Long> {

}
