package com.cafetostado.sistemacafetostadoapi;

import java.util.ArrayList;
import java.util.List;

public class ProductoService {

    public List<String> consultarProductos() {

        List<String> productos = new ArrayList<>();

        productos.add("Café tostado 250g - Huila - $15.000");
        productos.add("Café tostado 500g - Huila - $28.000");
        productos.add("Café tostado 1 libra - Huila - $30.000");

        return productos;
    }
}