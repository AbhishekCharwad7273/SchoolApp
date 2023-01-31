package com.SchoolApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolApp.Entity.User;

public interface UserRepo extends JpaRepository<User, String>{

}
