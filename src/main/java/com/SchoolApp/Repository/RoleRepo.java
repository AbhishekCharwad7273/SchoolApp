package com.SchoolApp.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolApp.Entity.Role;



public interface RoleRepo extends JpaRepository<Role, String> {

}
