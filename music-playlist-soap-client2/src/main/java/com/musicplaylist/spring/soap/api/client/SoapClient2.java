package com.musicplaylist.spring.soap.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.example.playlist.registering.RegisterRequest;
import com.example.playlist.registering.RegisterResponse;

@Service
public class SoapClient2 {

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;

	public RegisterResponse getRegisterStatus(RegisterRequest request) {
		template = new WebServiceTemplate(marshaller);
		RegisterResponse regResponse = (RegisterResponse) template.marshalSendAndReceive("http://localhost:8080/ws",
				request);
		return regResponse;
	}

}
