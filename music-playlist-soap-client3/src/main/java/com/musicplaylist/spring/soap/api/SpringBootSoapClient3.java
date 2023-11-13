package com.musicplaylist.spring.soap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.playlist.unregistering.UnregisterRequest;
import com.example.playlist.unregistering.UnregisterResponse;
import com.musicplaylist.spring.soap.api.client.SoapClient3;

@SpringBootApplication
@RestController
public class SpringBootSoapClient3 {
	
	@Autowired
	private SoapClient3 client;
	
	@PostMapping("/getUnregisterStatus")
	public UnregisterResponse invokeSoapClientToGetUnregStatus(@RequestBody UnregisterRequest request) {
		return client.getUnregisterStatus(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapClient3.class, args);
	}

}
