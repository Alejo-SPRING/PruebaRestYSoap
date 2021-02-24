package com.prueba.backend.app.pojos;

public class Authentication {

	private String ultimaFechaDeAutenticacion;
	private String ultimaHoraDeAuthenticacion;
	private Long intentosEnUltimaAutenticacion;
	
	public Authentication(String ultimaFechaDeAutenticacion, String ultimaHoraDeAuthenticacion,
			Long intentosEnUltimaAutenticacion) {
		this.ultimaFechaDeAutenticacion = ultimaFechaDeAutenticacion;
		this.ultimaHoraDeAuthenticacion = ultimaHoraDeAuthenticacion;
		this.intentosEnUltimaAutenticacion = intentosEnUltimaAutenticacion;
	}

	public String getUltimaFechaDeAutenticacion() {
		return ultimaFechaDeAutenticacion;
	}

	public void setUltimaFechaDeAutenticacion(String ultimaFechaDeAutenticacion) {
		this.ultimaFechaDeAutenticacion = ultimaFechaDeAutenticacion;
	}

	public String getUltimaHoraDeAuthenticacion() {
		return ultimaHoraDeAuthenticacion;
	}

	public void setUltimaHoraDeAuthenticacion(String ultimaHoraDeAuthenticacion) {
		this.ultimaHoraDeAuthenticacion = ultimaHoraDeAuthenticacion;
	}

	public Long getIntentosEnUltimaAutenticacion() {
		return intentosEnUltimaAutenticacion;
	}

	public void setIntentosEnUltimaAutenticacion(Long intentosEnUltimaAutenticacion) {
		this.intentosEnUltimaAutenticacion = intentosEnUltimaAutenticacion;
	}

}
