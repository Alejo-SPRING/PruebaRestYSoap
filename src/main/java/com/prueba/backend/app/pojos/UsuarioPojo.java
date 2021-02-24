package com.prueba.backend.app.pojos;

public class UsuarioPojo {

	private String nombreCompleto;
	private String telefonoDeContacto;
	private String correoElectronico;
	private String codigoDeUsurio;
	private Authentication informacionDeAutenticacion;

	public UsuarioPojo(String nombreCompleto, String telefonoDeContacto, String correoElectronico,
			String codigoDeUsurio, Authentication informacionDeAutenticacion) {
		this.nombreCompleto = nombreCompleto;
		this.telefonoDeContacto = telefonoDeContacto;
		this.correoElectronico = correoElectronico;
		this.codigoDeUsurio = codigoDeUsurio;
		this.informacionDeAutenticacion = informacionDeAutenticacion;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getTelefonoDeContacto() {
		return telefonoDeContacto;
	}

	public void setTelefonoDeContacto(String telefonoDeContacto) {
		this.telefonoDeContacto = telefonoDeContacto;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getCodigoDeUsurio() {
		return codigoDeUsurio;
	}

	public void setCodigoDeUsurio(String codigoDeUsurio) {
		this.codigoDeUsurio = codigoDeUsurio;
	}

	public Authentication getInformacionDeAutenticacion() {
		return informacionDeAutenticacion;
	}

	public void setInformacionDeAutenticacion(Authentication informacionDeAutenticacion) {
		this.informacionDeAutenticacion = informacionDeAutenticacion;
	}

}
