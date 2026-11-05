package com.cafetostado.sistemacafetostadoapi;

import java.util.ArrayList;
import java.util.List;

public class RegistroProductoService {

    private List<String> productos = new ArrayList<>();

    public String registrarProducto(String nombre, String origen, int peso, double precio) {

        if (nombre == null || nombre.isEmpty()) {
            return "Error: el nombre del producto es obligatorio.";
        }

        String producto = nombre + " - " + origen
                + " - " + peso + "g - $" + precio;

        productos.add(producto);

        return "Producto registrado satisfactoriamente.";
    }

    public List<String> obtenerProductosRegistrados() {
        return productos;
    }
}