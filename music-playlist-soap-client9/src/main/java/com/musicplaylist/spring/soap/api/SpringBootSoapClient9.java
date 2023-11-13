package com.musicplaylist.spring.soap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.playlist.orderPlaylist.OrderPlaylistRequest;
import com.example.playlist.orderPlaylist.OrderPlaylistResponse;
import com.musicplaylist.spring.soap.api.client.SoapClient9;

@SpringBootApplication
@RestController
public class SpringBootSoapClient9 {
	
	@Autowired
	private SoapClient9 client;
	
	@PostMapping("/getOrderPlaylistStatus")
	public OrderPlaylistResponse invokeSoapClientToGetOrderPlaylistStatus(@RequestBody OrderPlaylistRequest request) {
		return client.getOrderPlaylistStatus(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapClient9.class, args);
	}

}
