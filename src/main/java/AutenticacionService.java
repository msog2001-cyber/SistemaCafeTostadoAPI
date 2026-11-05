package com.mycompany.sistemacafetostadoapi;

/**
 * Servicio de autenticación para el sistema de café tostado.
 */
public class AutenticacionService {

    // Usuario y contraseña de prueba
    private final String usuarioCorrecto = "admin";
    private final String contrasenaCorrecta = "12345";

    /**
     * Verifica las credenciales ingresadas por el usuario.
     */
    public String autenticar(String usuario, String contrasena) {

        // Comprobar si el usuario y la contraseña son correctos
        if (usuarioCorrecto.equals(usuario)
                && contrasenaCorrecta.equals(contrasena)) {

            return "Autenticación satisfactoria";
        } else {
            return "Error de autenticación";
        }
    }
}