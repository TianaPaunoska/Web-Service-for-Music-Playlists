package com.musicplaylist.spring.soap.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.example.playlist.orderPlaylist.OrderPlaylistRequest;
import com.example.playlist.orderPlaylist.OrderPlaylistResponse;


@Service
public class SoapClient9 {

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;

	public OrderPlaylistResponse getOrderPlaylistStatus(OrderPlaylistRequest request) {
		template = new WebServiceTemplate(marshaller);
		OrderPlaylistResponse orderPlaylistResponse = (OrderPlaylistResponse) template.marshalSendAndReceive("http://localhost:8080/ws",
				request);
		return orderPlaylistResponse;
	}

}
