package com.musicplaylist.spring.soap.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.example.playlist.sendPlaylist.SendPlaylistRequest;
import com.example.playlist.sendPlaylist.SendPlaylistResponse;

@Service
public class SoapClient7 {

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;

	public SendPlaylistResponse getSendPlaylistStatus(SendPlaylistRequest request) {
		template = new WebServiceTemplate(marshaller);
		SendPlaylistResponse sendPlaylistResponse = (SendPlaylistResponse) template.marshalSendAndReceive("http://localhost:8080/ws",
				request);
		return sendPlaylistResponse;
	}

}
