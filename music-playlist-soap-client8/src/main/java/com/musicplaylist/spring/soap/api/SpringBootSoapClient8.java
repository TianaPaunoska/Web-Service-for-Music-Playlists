package com.musicplaylist.spring.soap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.playlist.shufflePlaylist.ShufflePlaylistRequest;
import com.example.playlist.shufflePlaylist.ShufflePlaylistResponse;
import com.musicplaylist.spring.soap.api.client.SoapClient8;

@SpringBootApplication
@RestController
public class SpringBootSoapClient8 {
	
	@Autowired
	private SoapClient8 client;
	
	@PostMapping("/getShufflePlaylistStatus")
	public ShufflePlaylistResponse invokeSoapClientToGetShufflePlaylistStatus(@RequestBody ShufflePlaylistRequest request) {
		return client.getShufflePlaylistStatus(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapClient8.class, args);
	}

}
