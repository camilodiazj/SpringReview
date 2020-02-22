package com.example.Factura;

import com.example.Factura.Models.ItemFactura;
import com.example.Factura.Models.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<ItemFactura> itemList(){
        Producto producto = new Producto("Coca-Cola",3500);
        Producto producto1 = new Producto("Celular",1850000);
        ItemFactura linea1 = new ItemFactura(producto,10);
        ItemFactura linea2 = new ItemFactura(producto1,20);
        return Arrays.asList(linea1,linea2);
    }

    @Bean
    @Primary
    public List<ItemFactura> itemFacturaOficina(){
        Producto producto = new Producto("Monitor LG",800000);
        Producto producto1 = new Producto("Telefono Oficina",300000);
        Producto producto2 = new Producto("Impresora Multifuncional",150000);
        Producto producto3 = new Producto("Escritorio de oficina",750000);
        ItemFactura linea1 = new ItemFactura(producto,5);
        ItemFactura linea2 = new ItemFactura(producto2,2);
        ItemFactura linea3 = new ItemFactura(producto3,1);
        ItemFactura linea4 = new ItemFactura(producto1,4);
        return Arrays.asList(linea1,linea2,linea3,linea4);
    }

}
