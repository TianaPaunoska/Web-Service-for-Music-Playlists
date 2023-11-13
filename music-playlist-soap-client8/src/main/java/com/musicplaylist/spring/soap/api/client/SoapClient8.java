package com.musicplaylist.spring.soap.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.example.playlist.shufflePlaylist.ShufflePlaylistRequest;
import com.example.playlist.shufflePlaylist.ShufflePlaylistResponse;


@Service
public class SoapClient8 {

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;

	public ShufflePlaylistResponse getShufflePlaylistStatus(ShufflePlaylistRequest request) {
		template = new WebServiceTemplate(marshaller);
		ShufflePlaylistResponse shufflePlaylistResponse = (ShufflePlaylistResponse) template.marshalSendAndReceive("http://localhost:8080/ws",
				request);
		return shufflePlaylistResponse;
	}

}
