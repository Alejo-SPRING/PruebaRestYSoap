package com.prueba.backend.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.backend.app.pojos.UsuarioPojo;
import com.prueba.backend.app.services.IUsuarioService;

@RestController
@RequestMapping("/IOAuthenticationSystem/UserManagement/rest/UserService")
public class RestUsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/users")
	public ResponseEntity<?> findAll() {
		return new ResponseEntity<List<UsuarioPojo>>(usuarioService.findAll(), HttpStatus.OK);
	}
	
}
