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
public class Cliente implements Serializable {

    public String DNI;
    public String nombre;
    public String correo;
    public String clave;
    public String cod_postal;
    public String ciudad;
    public String tjt_credito;
    public String CCV;
    public boolean estado;

    

    public Cliente(String DNI, String nombre, String correo, String clave, String cod_postal, String ciudad, String tjt_credito, String ccv) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.cod_postal = cod_postal;
        this.ciudad = ciudad;
        this.tjt_credito = tjt_credito;
        this.CCV = ccv;
        this.estado = true;
    }

    
    /**
     * Get the value of CCV
     *
     * @return the value of CCV
     */
    public String getCCV() {
        return CCV;
    }

    /**
     * Set the value of CCV
     *
     * @param CCV new value of CCV
     */
    public void setCCV(String CCV) {
        this.CCV = CCV;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTjt_credito() {
        return tjt_credito;
    }

    public void setTjt_credito(String tjt_credito) {
        this.tjt_credito = tjt_credito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "DNI= " + DNI + ", nombre=" + nombre + ", e-mail=" + correo + ", clave=" + clave + ", código postal=" + cod_postal + ", ciudad=" + ciudad + ", tarjeta de crédito=" + tjt_credito + "}";
    }

}
