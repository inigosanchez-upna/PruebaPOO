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
public class ClienteProfesional extends Cliente {

    public String descripcion;
    public String horario;
    public String telefono;
    public String web;

    public ClienteProfesional(String descripcion, String horario, String telefono, String web, String DNI, String nombre, String correo, String clave, String cod_postal, String ciudad, String tjt_credito, String ccv) {
        super(DNI, nombre, correo, clave, cod_postal, ciudad, tjt_credito,ccv);
        this.descripcion = descripcion;
        this.horario = horario;
        this.telefono = telefono;
        this.web = web;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "Cliente Profesional{" + "DNI= " + DNI + ", nombre= " + nombre + ", e-mail= " + correo + ", clave= " + clave + ", código postal= " + cod_postal + ", ciudad= " + ciudad + ", tarjeta de crédito= " + tjt_credito + ", descripción= " + descripcion + ", horario= " + horario + ", teléfono= " + telefono + ", web= " + web + "}";
    }

}
