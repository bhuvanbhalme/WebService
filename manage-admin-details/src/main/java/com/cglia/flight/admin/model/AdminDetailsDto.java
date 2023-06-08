package com.cglia.flight.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AdminDetails")
public class AdminDetailsDto {
	@Id
	@Column(name = "admin_id")
	private int adminId;
	@Column(name = "admin_name")
	private String adminName;
	@Column(name = "admin_email")
	private String adminEmail;
	@Column(name = "admin_join_date")
	private String adminJoinDate;
	@Column(name = "admin_detail_update_date")
	private String adminDetailUpdateDate;
	@Column(name = "admin_leave_date")
	private String adminLeaveDate;
	@Column(name = "admin_status")
	private int adminStatus;

	public AdminDetailsDto(int adminId, String adminName, String adminEmail, String adminJoinDate,
			String adminDetailUpdateDate, String adminLeaveDate, int adminStatus) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminJoinDate = adminJoinDate;
		this.adminDetailUpdateDate = adminDetailUpdateDate;
		this.adminLeaveDate = adminLeaveDate;
		this.adminStatus = adminStatus;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminJoinDate() {
		return adminJoinDate;
	}

	public void setAdminJoinDate(String adminJoinDate) {
		this.adminJoinDate = adminJoinDate;

	}

	public String getAdminDetailUpdateDate() {
		return adminDetailUpdateDate;
	}

	public void setAdminDetailUpdateDate(String adminDetailUpdateDate) {
		this.adminDetailUpdateDate = adminDetailUpdateDate;
	}

	public String getAdminLeaveDate() {
		return adminLeaveDate;
	}

	public void setAdminLeaveDate(String adminLeaveDate) {
		this.adminLeaveDate = adminLeaveDate;
	}

	public int getAdminStatus() {
		return adminStatus;
	}

	public void setAdminStatus(int i) {
		this.adminStatus = i;
	}

	public AdminDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
}
