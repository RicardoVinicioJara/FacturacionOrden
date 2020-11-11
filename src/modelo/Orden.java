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




public class Orden {
    private int codigo;
    private String fechaini;
    private Cliente cliente;
    private Empleado empleado;
    private double total;
    private double abono;
    private double saldo;
    private String obcervaciones;
    private String catacteristicas;
    private String numeroSerie;
    private String Descripocion;
    private String fechafin;
    private String notas;

    public Orden() {
    }

    public Orden(int codigo, String fechaini, Cliente cliente, Empleado empleado, double total, double abono, double saldo, String obcervaciones, String catacteristicas, String numeroSerie, String Descripocion, String fechafin, String notas) {
        this.codigo = codigo;
        this.fechaini = fechaini;
        this.cliente = cliente;
        this.empleado = empleado;
        this.total = total;
        this.abono = abono;
        this.saldo = saldo;
        this.obcervaciones = obcervaciones;
        this.catacteristicas = catacteristicas;
        this.numeroSerie = numeroSerie;
        this.Descripocion = Descripocion;
        this.fechafin = fechafin;
        this.notas = notas;
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getObcervaciones() {
        return obcervaciones;
    }

    public void setObcervaciones(String obcervaciones) {
        this.obcervaciones = obcervaciones;
    }

    public String getCatacteristicas() {
        return catacteristicas;
    }

    public void setCatacteristicas(String catacteristicas) {
        this.catacteristicas = catacteristicas;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getDescripocion() {
        return Descripocion;
    }

    public void setDescripocion(String Descripocion) {
        this.Descripocion = Descripocion;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
    
    
   
    
}
