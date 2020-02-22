package com.example.Factura.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
public class Factura {
    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    private Cliente cliente;
    @Autowired
    private List<ItemFactura> items;

    @PostConstruct
    public void init(){
        cliente.setNombre(cliente.getNombre().concat(" ").concat("Antonio"));
        descripcion = descripcion.concat(" del cliente ").concat(cliente.getNombre());
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Factura destruida: ".concat(descripcion));
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }

    public Integer getTotalPrice() {
        Integer precio = 0;
        for (ItemFactura item : items) {
            precio += item.getPrice();
        }
        return precio;
    }
}
