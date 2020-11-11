/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author vinic
 */
public class Kardex {
    private int codigo;
    private Producto producto;
    private String date;
    private int contidadEntradas;
    private double valorEntradaUnidad;
    private double valorEntradasTotal;
    private int cantidadSalidas;
    private double valorSalidadUnidad;
    private double valorSalidadoTotal;
    private int catidadExistencia;
    private double valorExiteciUnidad;
    private double valorExiteciTotal;
    
            

    public Kardex() {
    }

    public Kardex(int codigo, Producto producto, String date, int contidadEntradas, double valorEntradaUnidad, double valorEntradasTotal, int cantidadSalidas, double valorSalidadUnidad, double valorSalidadoTotal, int catidadExistencia, double valorExiteciUnidad, double valorExiteciTotal) {
        this.codigo = codigo;
        this.producto = producto;
        this.date = date;
        this.contidadEntradas = contidadEntradas;
        this.valorEntradaUnidad = valorEntradaUnidad;
        this.valorEntradasTotal = valorEntradasTotal;
        this.cantidadSalidas = cantidadSalidas;
        this.valorSalidadUnidad = valorSalidadUnidad;
        this.valorSalidadoTotal = valorSalidadoTotal;
        this.catidadExistencia = catidadExistencia;
        this.valorExiteciUnidad = valorExiteciUnidad;
        this.valorExiteciTotal = valorExiteciTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    

    public int getContidadEntradas() {
        return contidadEntradas;
    }

    public void setContidadEntradas(int contidadEntradas) {
        this.contidadEntradas = contidadEntradas;
    }

    public double getValorEntradaUnidad() {
        return valorEntradaUnidad;
    }

    public void setValorEntradaUnidad(double valorEntradaUnidad) {
        this.valorEntradaUnidad = valorEntradaUnidad;
    }

    public double getValorEntradasTotal() {
        return valorEntradasTotal;
    }

    public void setValorEntradasTotal(double valorEntradasTotal) {
        this.valorEntradasTotal = valorEntradasTotal;
    }

    public int getCantidadSalidas() {
        return cantidadSalidas;
    }

    public void setCantidadSalidas(int cantidadSalidas) {
        this.cantidadSalidas = cantidadSalidas;
    }

    public double getValorSalidadUnidad() {
        return valorSalidadUnidad;
    }

    public void setValorSalidadUnidad(double valorSalidadUnidad) {
        this.valorSalidadUnidad = valorSalidadUnidad;
    }

    public double getValorSalidadoTotal() {
        return valorSalidadoTotal;
    }

    public void setValorSalidadoTotal(double valorSalidadoTotal) {
        this.valorSalidadoTotal = valorSalidadoTotal;
    }

    public int getCatidadExistencia() {
        return catidadExistencia;
    }

    public void setCatidadExistencia(int catidadExistencia) {
        this.catidadExistencia = catidadExistencia;
    }

    public double getValorExiteciUnidad() {
        return valorExiteciUnidad;
    }

    public void setValorExiteciUnidad(double valorExiteciUnidad) {
        this.valorExiteciUnidad = valorExiteciUnidad;
    }

    public double getValorExiteciTotal() {
        return valorExiteciTotal;
    }

    public void setValorExiteciTotal(double valorExiteciTotal) {
        this.valorExiteciTotal = valorExiteciTotal;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    

    
    
    
}
