package com.prueba.backend.app.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.prueba.backend.app.pojos.Authentication;
import com.prueba.backend.app.pojos.UsuarioPojo;

import io.soap.usuarios.GetUsuarioResponse;
import io.soap.usuarios.Usuario;
import io.soap.usuarios.Usuario.Autenticacion;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	private List<UsuarioPojo> usuarios;
	private GetUsuarioResponse response;
	private UsuarioPojo usuario;

	@Override
	public List<UsuarioPojo> findAll() {
		generarDatos();
		return usuarios;
	}

	public void generarDatos() {
		usuarios = new ArrayList<>();
		usuario = new UsuarioPojo("Anderson Rojas", "3162544311", "andersonalejandro-01@hotmail.com",
				UUID.randomUUID().toString(),
				new Authentication(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
						LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm a")),
						Double.valueOf(Math.random() * 10).longValue()));
		usuarios.add(usuario);
		
		usuario = new UsuarioPojo("Laura Gamba", "3152456789", "laura@hotmail.com",
				UUID.randomUUID().toString(),
				new Authentication(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
						LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm a")),
						Double.valueOf(Math.random() * 10).longValue()));
		usuarios.add(usuario);
		
		usuario = new UsuarioPojo("Bryan Pardo", "3189754301", "bryan@hotmail.com",
				UUID.randomUUID().toString(),
				new Authentication(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
						LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm a")),
						Double.valueOf(Math.random() * 10).longValue()));
		usuarios.add(usuario);
	}
	
	public void generarDatosSoap() {
		response = new GetUsuarioResponse();
		Autenticacion auth = new Autenticacion();
		auth.setIntentosEnUltimaAutenticacion(Double.valueOf(Math.random() * 10).intValue());
		auth.setUltimaFechaDeAuthenticacion(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		auth.setUltimaHoraDeAuthenticacion(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm a")));
		Usuario usuarioSoap = new Usuario();
		usuarioSoap.setNombreCompleto("Anderson Rojas");
		usuarioSoap.setTelefonoDeContacto("3162544311");
		usuarioSoap.setCodigoDeUsuario(UUID.randomUUID().toString());
		usuarioSoap.setCorreoElectronico("anderson@hotmail.com");
		usuarioSoap.setAutenticacion(auth);
		response.setUsuario(usuarioSoap);
		
		usuarioSoap = new Usuario();
		usuarioSoap.setNombreCompleto("Laura Gamba");
		usuarioSoap.setTelefonoDeContacto("3145345678");
		usuarioSoap.setCodigoDeUsuario(UUID.randomUUID().toString());
		usuarioSoap.setCorreoElectronico("laura@hotmail.com");
		usuarioSoap.setAutenticacion(auth);
		response.setUsuario2(usuarioSoap);
		
		usuarioSoap = new Usuario();
		usuarioSoap.setNombreCompleto("Bryan Pardo");
		usuarioSoap.setTelefonoDeContacto("3456785345");
		usuarioSoap.setCodigoDeUsuario(UUID.randomUUID().toString());
		usuarioSoap.setCorreoElectronico("bryan@hotmail.com");
		usuarioSoap.setAutenticacion(auth);
		response.setUsuario3(usuarioSoap);
		
	}

	@Override
	public GetUsuarioResponse findAllSOAP() {
		generarDatosSoap();
		return response;
	}

}
