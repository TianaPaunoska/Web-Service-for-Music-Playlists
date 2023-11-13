package com.musicplaylist.spring.soap.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.example.playlist.playlistInfo.PlaylistInfoRequest;
import com.example.playlist.playlistInfo.PlaylistInfoResponse;

@Service
public class SoapClient6 {

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;

	public PlaylistInfoResponse getPlaylistInfoStatus(PlaylistInfoRequest request) {
		template = new WebServiceTemplate(marshaller);
		PlaylistInfoResponse playlistInfoResponse = (PlaylistInfoResponse) template.marshalSendAndReceive("http://localhost:8080/ws",
				request);
		return playlistInfoResponse;
	}

}
