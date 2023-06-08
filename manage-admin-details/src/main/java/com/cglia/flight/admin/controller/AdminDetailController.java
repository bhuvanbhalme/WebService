package com.cglia.flight.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.flight.admin.model.AdminDetailsDto;
import com.cglia.flight.admin.service.AdminService;

@RestController
public class AdminDetailController {

	@Autowired
	private AdminService service;

	@PostMapping("/save")
	public String saveAdmin(@RequestBody AdminDetailsDto admin) {
		AdminDetailsDto newAdmin = service.saveAdmin(admin);
		String message = null;
		if (newAdmin != null) {
			message = "Admin inserted successfully.";
		} else {
			message = "Failed to insert Admin.";
		}
		return message;
	}

	@PutMapping("/update/{adminId}")
	public AdminDetailsDto updateAdmin(@RequestBody AdminDetailsDto admin, @PathVariable Integer adminId) {
		return service.updateAdmin(admin, adminId);
	}

	@GetMapping("/OneDetail/{adminId}")
	public AdminDetailsDto getOne(@PathVariable Integer adminId) {
		return service.getOneAdmin(adminId);
	}

	@GetMapping("/allDetails")
	public List<AdminDetailsDto> getAll() {
		return service.getAllAdmins();
	}

	@DeleteMapping("/delete/{adminId}")
	public void deleteAdmin(@PathVariable Integer adminId) {
		service.deleteAdmin(adminId);
	}

	@GetMapping("/details/{adminId}")
	public AdminDetailsDto getAdminDetails(@PathVariable("adminId") Integer adminId) {
		return service.getAdminDetails(adminId);
	}

	@GetMapping("/OneDetail")
	public AdminDetailsDto getOneByQueryParameter(@RequestParam Integer adminId) {
		return service.getOneAdmin(adminId);
	}

	@DeleteMapping("/delete")
	public void deleteAdminByQueryParameter(@RequestParam Integer adminId) {
		service.deleteAdmin(adminId);
	}

	@PutMapping("/update")
	public AdminDetailsDto updateAdminByQueryParameter(@RequestParam Integer adminId,
			@RequestBody AdminDetailsDto admin) {
		return service.updateAdmin(admin, adminId);
	}

	
}
