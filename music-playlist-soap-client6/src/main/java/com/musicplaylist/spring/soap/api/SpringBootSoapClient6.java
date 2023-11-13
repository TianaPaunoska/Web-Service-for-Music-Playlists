package com.musicplaylist.spring.soap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.playlist.playlistInfo.PlaylistInfoRequest;
import com.example.playlist.playlistInfo.PlaylistInfoResponse;
import com.musicplaylist.spring.soap.api.client.SoapClient6;

@SpringBootApplication
@RestController
public class SpringBootSoapClient6 {
	
	@Autowired
	private SoapClient6 client;
	
	@PostMapping("/getPlaylistInfoStatus")
	public PlaylistInfoResponse invokeSoapClientToGetPlaylistInfoStatus(@RequestBody PlaylistInfoRequest request) {
		return client.getPlaylistInfoStatus(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapClient6.class, args);
	}

}
