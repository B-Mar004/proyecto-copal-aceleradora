package com.proyecto.configuracion.excepciones;

public class BadGatewayException extends RuntimeException {
    public BadGatewayException(String mensaje) {
        super(mensaje);
    }
}
