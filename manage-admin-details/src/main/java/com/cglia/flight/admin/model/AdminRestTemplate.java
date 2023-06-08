package com.cglia.flight.admin.model;

public class AdminRestTemplate {
	
	
	private String customername;
	private String customerEmail;
	
	public AdminRestTemplate() {
		super();
	}
	
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Override
	public String toString() {
		return "CustomerRestTemplate [customername=" + customername + ", customerEmail=" + customerEmail + "]";
	}
		

}
