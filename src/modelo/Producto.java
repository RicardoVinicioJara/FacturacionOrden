/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author mayra
 */
public class Producto {
    
    private int id;
    private String nombre;
    private String codigo;
    private String medida;
    private int stock;
    private Double precio;

    public Producto() {
    }

    public Producto(int id, String nombre, String codigo, String medida, int stock, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.medida = medida;
        this.stock = stock;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
    
    @Override
    public String toString() {
        return "Producto{" + "codigo=" + id + ",\n"
                + " nombre=" + nombre + ",\n marca=" + codigo + 
                ", \nmedida=" + medida + ",\n proveedor=" +'}';
    }
    
    
    
}
