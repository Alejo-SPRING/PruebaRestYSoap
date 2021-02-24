package com.prueba.backend.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.prueba.backend.app.services.IUsuarioService;

import io.soap.usuarios.GetUsuarioResponse;

@Endpoint
public class SoapUsuarioController {

	private final static String NAME_SPACE = "http://soap.io/usuarios";
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@PayloadRoot(namespace = NAME_SPACE, localPart = "getUsuarioResponse")
	@ResponsePayload
	public GetUsuarioResponse findAll() {
		return usuarioService.findAllSOAP();
	}
	
}
