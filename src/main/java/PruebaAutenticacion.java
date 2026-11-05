package com.mycompany.sistemacafetostadoapi;

/**
 * Clase para probar el servicio de autenticación.
 */
public class PruebaAutenticacion {

    public static void main(String[] args) {

        // Crear el servicio de autenticación
        AutenticacionService servicio = new AutenticacionService();

        // Probar las credenciales correctas
        String resultado = servicio.autenticar("admin", "12345");

        // Mostrar el resultado
        System.out.println(resultado);
    }
}