package com.proyecto.configuracion.excepciones;

public class InternalServerErrorException extends RuntimeException {
    public InternalServerErrorException(String mensaje) {
        super(mensaje);
    }
}
