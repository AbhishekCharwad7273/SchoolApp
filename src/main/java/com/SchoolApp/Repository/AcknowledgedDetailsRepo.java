package com.SchoolApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SchoolApp.Entity.AcknowledgedDetails;

public interface AcknowledgedDetailsRepo extends JpaRepository<AcknowledgedDetails, Long>{

}
