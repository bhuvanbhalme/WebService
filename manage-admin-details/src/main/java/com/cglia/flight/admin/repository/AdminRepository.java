package com.cglia.flight.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.flight.admin.model.AdminDetailsDto;
@Repository
public interface AdminRepository extends JpaRepository<AdminDetailsDto, Integer> {

}