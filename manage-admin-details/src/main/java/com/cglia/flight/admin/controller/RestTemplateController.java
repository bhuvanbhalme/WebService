package com.cglia.flight.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cglia.flight.admin.model.AdminRestTemplate;

@RestController
@RequestMapping("/admin")
public class RestTemplateController {

	private final RestTemplate restTemplate;

	@Autowired
	public RestTemplateController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@GetMapping("/getById/{id}")
	public String getCustomerData(@PathVariable String id) {
		String url = "http://192.168.60.60:8520/get/" + id;
		// Send HTTP GET request to the external web service
		String response = restTemplate.getForObject(url, String.class);
		// Process the response as needed
		return response;
	}

	@PostMapping("/put")
	public String postCustomerData(@RequestBody AdminRestTemplate customer) {
		String url = "http://192.168.60.60:8520/save";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		// Create the request entity with the requestData as the body and headers
		HttpEntity<AdminRestTemplate> requestEntity = new HttpEntity<>(customer, headers);

		// Send HTTP POST request to the external web service
		String response = restTemplate.postForObject(url, requestEntity, String.class);

		// Process the response as needed
		return response;

	}

	@DeleteMapping("/delete/{id}")
	public String deleteCustomerData(@PathVariable String id) {
		String url = "http://192.168.60.60:8520/delete/" + id;
		// Send HTTP GET request to the external web service
		restTemplate.delete(url);
		// Process the response as needed
		return "deleted successfully";
	}

	@PutMapping("/put/{id}")
	public String updateCustomerData(@RequestBody AdminRestTemplate customer, @PathVariable String id) {
		String url = "http://192.168.60.60:8520/put/" + id;

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		// Create the request entity with the requestData as the body and headers
		HttpEntity<AdminRestTemplate> requestEntity = new HttpEntity<>(customer, headers);

		// Send HTTP POST request to the external web service
		restTemplate.put(url, requestEntity, id);

		// Process the response as needed
		return "updated successfully";

	}
	@GetMapping("/get")
	public String getAllCustomerData() {
		String url = "http://192.168.60.55:7000/getall";
		// Send HTTP GET request to the external web service
		String response = restTemplate.getForObject(url, String.class);
		// Process the response as needed
		return response;
	}
}