package com.musicplaylist.spring.soap.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.example.playlist.userInfo.UserInfoRequest;
import com.example.playlist.userInfo.UserInfoResponse;


@Service
public class SoapClient5 {

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;

	public UserInfoResponse getUserInfoStatus(UserInfoRequest request) {
		template = new WebServiceTemplate(marshaller);
		UserInfoResponse userInfoResponse = (UserInfoResponse) template.marshalSendAndReceive("http://localhost:8080/ws",
				request);
		return userInfoResponse;
	}

}
