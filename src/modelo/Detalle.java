/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author EstRicardoVinicioJar
 */
public class Detalle {
    private int codigo;
    private int producto;
    private int cantidad;
    private int factura;

    public Detalle() {
    }

    public Detalle(int codigo, int producto, int cantidad, int factura) {
        this.codigo = codigo;
        this.producto = producto;
        this.cantidad = cantidad;
        this.factura = factura;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    
    
    
}
