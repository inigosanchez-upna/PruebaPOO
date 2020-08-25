/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapop;

import java.io.Serializable;

/**
 *
 * @author Daniel González González - GISI
 */
public class Venta implements Serializable {
    
    public Producto producto;
    public String fechaVenta;
    public String DNIComprador;
    public String DNIVendedor;
    public String nombreComprador;
    public String nombreVendedor;

    public Venta(Producto producto, String fechaVenta, String DNIComprador, String DNIVendedor, String nombreComprador, String nombreVendedor) {
        this.producto = producto;
        this.fechaVenta = fechaVenta;
        this.DNIComprador = DNIComprador;
        this.DNIVendedor = DNIVendedor;
        this.nombreComprador = nombreComprador;
        this.nombreVendedor = nombreVendedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getDNIComprador() {
        return DNIComprador;
    }

    public void setDNIComprador(String DNIComprador) {
        this.DNIComprador = DNIComprador;
    }

    public String getDNIVendedor() {
        return DNIVendedor;
    }

    public void setDNIVendedor(String DNIVendedor) {
        this.DNIVendedor = DNIVendedor;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }
}
