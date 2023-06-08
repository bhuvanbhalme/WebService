package com.cglia.flight.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.flight.admin.model.AdminDetailsDto;
import com.cglia.flight.admin.repository.AdminRepository;

import java.util.List;

@Service
public class AdminService {

	@Autowired
	private AdminRepository repo;

	public AdminDetailsDto saveAdmin(AdminDetailsDto admin) {
		return repo.save(admin);
	}

	public AdminDetailsDto updateAdmin(AdminDetailsDto admin, Integer adminId) {
		AdminDetailsDto oldAdmin = repo.findById(adminId).orElse(null);
		if (oldAdmin != null) {
			oldAdmin.setAdminName(admin.getAdminName());
			oldAdmin.setAdminEmail(admin.getAdminEmail());
			oldAdmin.setAdminJoinDate(admin.getAdminJoinDate());
			oldAdmin.setAdminDetailUpdateDate(admin.getAdminDetailUpdateDate());
			oldAdmin.setAdminLeaveDate(admin.getAdminLeaveDate());
			oldAdmin.setAdminStatus(admin.getAdminStatus());
			return repo.save(oldAdmin);
		}
		return null;
	}

	public AdminDetailsDto getOneAdmin(Integer adminId) {
		return repo.findById(adminId).orElse(null);
	}

	public List<AdminDetailsDto> getAllAdmins() {
		return repo.findAll();
	}

	public void deleteAdmin(Integer adminId) {
		AdminDetailsDto adminDetails = repo.findById(adminId).orElse(null);
		if (adminDetails != null) {
			adminDetails.setAdminStatus(0);
			repo.save(adminDetails);
		}
	}

	public AdminDetailsDto getAdminDetails(Integer adminId) {
		return repo.findById(adminId).orElse(null);
	}
}
