package com.musicplaylist.spring.soap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.playlist.userInfo.UserInfoRequest;
import com.example.playlist.userInfo.UserInfoResponse;
import com.musicplaylist.spring.soap.api.client.SoapClient5;


@SpringBootApplication
@RestController
public class SpringBootSoapClient5 {
	
	@Autowired
	private SoapClient5 client;
	
	@PostMapping("/getUserInfoStatus")
	public UserInfoResponse invokeSoapClientToGetUserInfoStatus(@RequestBody UserInfoRequest request) {
		return client.getUserInfoStatus(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapClient5.class, args);
	}

}
