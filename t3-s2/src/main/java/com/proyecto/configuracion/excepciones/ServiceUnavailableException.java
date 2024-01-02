package com.proyecto.configuracion.excepciones;

public class ServiceUnavailableException extends RuntimeException {
    public ServiceUnavailableException(String mensaje) {
        super(mensaje);
    }

}
