package com.musicplaylist.spring.soap.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.example.playlist.unregistering.UnregisterRequest;
import com.example.playlist.unregistering.UnregisterResponse;


@Service
public class SoapClient3 {

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;

	public UnregisterResponse getUnregisterStatus(UnregisterRequest request) {
		template = new WebServiceTemplate(marshaller);
		UnregisterResponse regResponse = (UnregisterResponse) template.marshalSendAndReceive("http://localhost:8080/ws",
				request);
		return regResponse;
	}

}
