package com.example.Factura.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemFactura {

    private Producto producto;
    private Integer cantidad;

    public ItemFactura(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @JsonProperty("Precio")
    public Integer getPrice(){
        return cantidad*producto.getPrecio();
    }
}
