package com.gabriel.ezequiel.ionicbackend.resources.service.exception;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -7241732052782932335L;
	
	public ObjectNotFoundException(String mensagem) {
		super(mensagem);
		
	}
	public ObjectNotFoundException(String mensagem, Throwable cause) {
		super(mensagem, cause);
	}

}
