package com.prueba.backend.app.services;

import java.util.List;

import com.prueba.backend.app.pojos.UsuarioPojo;

import io.soap.usuarios.GetUsuarioResponse;

public interface IUsuarioService {

	public List<UsuarioPojo> findAll();
	
	public GetUsuarioResponse findAllSOAP();
	
}
