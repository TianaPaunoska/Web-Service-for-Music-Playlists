package com.musicplaylist.spring.soap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.playlist.sendPlaylist.SendPlaylistRequest;
import com.example.playlist.sendPlaylist.SendPlaylistResponse;
import com.musicplaylist.spring.soap.api.client.SoapClient7;

@SpringBootApplication
@RestController
public class SpringBootSoapClient7 {
	
	@Autowired
	private SoapClient7 client;
	
	@PostMapping("/getSendPlaylistStatus")
	public SendPlaylistResponse invokeSoapClientToGetSendPlaylistStatus(@RequestBody SendPlaylistRequest request) {
		return client.getSendPlaylistStatus(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapClient7.class, args);
	}

}
