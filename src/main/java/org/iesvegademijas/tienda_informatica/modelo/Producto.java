package org.iesvegademijas.tienda_informatica.modelo;

public class Producto {
    int codigo;
    String nombre;
    Double precio;
    int idFabricante;

    public Producto(){}

    public Producto(int codigo, String nombre, Double precio, int idFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.idFabricante = idFabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", idFabricante=" + idFabricante +
                '}';
    }
}
