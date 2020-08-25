/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapop;

/**
 *
 * @author Daniel González González - GISI
 */
import java.io.Serializable;
import static javapop.JavaPoP.cod_postal;

public class Producto implements Serializable {

    public String nombre;
    public String descripcion;
    public String categoria;
    public String condicion;
    public double precio;
    public String fecha;
    public String ubicacion;
    public Cliente propietario;
    public boolean urgente;
    public int proximidad;

    
    public Producto(String nombre, String descripcion, String categoria, String estado, double precio, String fecha, String ubicacion, Cliente propietario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.condicion = estado;
        this.precio = precio;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.propietario = propietario;
        this.proximidad = 0;
        this.urgente = false;
        
    }

    public Producto(String nombre, String descripcion, String categoria, String estado, double precio, String fecha, String ubicacion, Cliente propietario, boolean urgente) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.condicion = estado;
        this.precio = precio;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.propietario = propietario;
        this.proximidad = 0;
        this.urgente = urgente;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public int getProximidad() {
        return proximidad;
    }

    public void setProximidad(int proximidad) {
        this.proximidad = proximidad;
    }
    
    /**
     * Este método comprueba la próximidad de las ubicaciones mediante el código postal
     * @param cod_post1
     * @param cod_post2
     * @return 
     */
    private static int proximidad(String cod_post1, String cod_post2) {
        int prox = 0;
        int i = 0;
        int coincidencia = 5;

        while (i < cod_post1.length()) {
            if (cod_post1.charAt(i) != cod_post2.charAt(i)) {
                coincidencia--;
            }
            i++;
        }
        switch (coincidencia) {
            case 0:
                prox = 5; //Muy Lejano
                break;
            case 1:
                prox = 4; //Lejano
                break;
            case 2:
                prox = 3; //Proximo
                break;
            case 3:
                prox = 2; //Muy Proximo
                break;
            case 4:
                prox = 1; //Muy Proximo
                break;
        }

        return prox;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre= " + nombre + ", descripción= " + descripcion + ", categoría= " + categoria + ", estado= " + condicion + ", precio= " + precio + ", fecha= " + fecha + ", ubicación= " + ubicacion + ", propietario= " + propietario.nombre + ", urgente= " + urgente + ", proximidad= " + proximidad +"}";
    }

}
