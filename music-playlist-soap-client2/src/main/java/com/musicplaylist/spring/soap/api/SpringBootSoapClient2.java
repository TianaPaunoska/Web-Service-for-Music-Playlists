package com.musicplaylist.spring.soap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.musicplaylist.spring.soap.api.client.SoapClient2;
import com.example.playlist.registering.RegisterRequest;
import com.example.playlist.registering.RegisterResponse;

@SpringBootApplication
@RestController
public class SpringBootSoapClient2 {
	
	@Autowired
	private SoapClient2 client;
	
	@PostMapping("/getRegisterStatus")
	public RegisterResponse invokeSoapClientToGetRegStatus(@RequestBody RegisterRequest request) {
		return client.getRegisterStatus(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapClient2.class, args);
	}

}
