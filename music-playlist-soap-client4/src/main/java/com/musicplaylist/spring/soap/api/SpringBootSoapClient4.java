package com.musicplaylist.spring.soap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.playlist.changePassword.ChangePasswordRequest;
import com.example.playlist.changePassword.ChangePasswordResponse;
import com.musicplaylist.spring.soap.api.client.SoapClient4;

@SpringBootApplication
@RestController
public class SpringBootSoapClient4 {
	
	@Autowired
	private SoapClient4 client;
	
	@PostMapping("/getChangePasswordStatus")
	public ChangePasswordResponse invokeSoapClientToGetChangePassStatus(@RequestBody ChangePasswordRequest request) {
		return client.getChangePasswordStatus(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapClient4.class, args);
	}

}
