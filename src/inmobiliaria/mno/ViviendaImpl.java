/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmobiliaria.mno;

import Excepciones.PrecioNegativoException;

/**
 *
 * @author mauricio
 */
//propiedades
public class ViviendaImpl implements Vivienda{
    protected double superficie;
    protected double precio;
    protected Operacion operacion;
    protected String direccion;
    
private final int REBAJA = 10;


    //get y set
    public double getSuperficie(){
        return this.superficie;
    }
    public double getPrecio(){
        return this.precio;
    }
    public Operacion getOperacion(){
        return this.operacion;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public void setSuperficie(double superficie){
        this.superficie= superficie;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
//constructores
    public ViviendaImpl(double superficie, double precio, Operacion operacion, String direccion) {
        this.superficie = superficie;
        //EJERCICIO 5 SEGUNDA ENTREGA
        try{
            checkPrecio(precio);
        this.precio = precio;
        }catch (PrecioNegativoException e){
        System.out.println(e);
    }
        
        this.operacion = operacion;
        this.direccion = direccion;
    }
    public ViviendaImpl(String direccion){
        this.superficie=90.0;
        this.precio=150000;
        this.operacion= Operacion.VENTA;
        this.direccion=direccion;
    }
    public ViviendaImpl(){
        this.superficie=0.0;
        this.precio=0.0;
        this.operacion=null;
        this.direccion="";
    }
    
   //metodos extra EJERCICIO3
    /**
     * Calcula el precio rebajado al 10€
     * @return precio rebajado
     */
    public double getRebaja(){
        return this.precio - (this.precio/REBAJA);
    }
    //EJERCICIO4
    
    public String toString(){
        return "direccion: " + this.direccion + "- precio: " + this.precio + "- superficie: " + this.superficie + "- operacion: " + this.operacion;
    }
    //EJERCICIO5
     /**
     * Te dice si los 2 objetos tienen la misma operacion
     * @return operacion (true o false)
     */
    public boolean esUnaOperacion(Operacion operacion){
        return this.operacion == operacion;
    }
    //EJERCICIO6
      /**
     * Calcula la comision que se lleva la inmobiliaria
     * @return Precio de la comision
     */
    public double getComision(){
    if(this.operacion == Operacion.ALQUILER){
        return this.precio - (this.precio / 8);
    }
    else if(this.operacion == Operacion.VENTA){
        return this.precio - (this.precio / 14);
    }
    else if(this.operacion == Operacion.ALQUILER_CON_OPCION_A_VENTA){
        return this.precio - (this.precio / 11);
    }
    else{return 0.0;}
    
    }
    //EJERCICIO7
    //EJERCICIO7.1
      /**
     * Calcula el precio por metro cuadrado
     * @return  precio / metro cuadrado
     */
    public double getCalcularPrecioMetroCuadrado(){
    return this.precio / this.superficie;
    } 
    //EJERCICIO7.2
      /**
     * Compara los objetos(viviendas)
     * @return  la direccion de la vivienda con el precio mas caro por m2
     */
    public String getcomparadorDeViviendas(Vivienda otraVivienda) {
     if(this.operacion == otraVivienda.getOperacion()){
         if(this.getCalcularPrecioMetroCuadrado()>otraVivienda.getCalcularPrecioMetroCuadrado())
             return this.direccion;
         else if(this.getCalcularPrecioMetroCuadrado()<otraVivienda.getCalcularPrecioMetroCuadrado())
             return otraVivienda.getDireccion();
     }   
     else{}
     return "Las viviendas no tienen la misma operación";
    }
    //EJERCICIO8
      /**
     * Te dice cual es el tamaño de la vivienda
     * @return tamaño de la vivienda
     */
    public String getTamanyoVivienda(){
        String tamanyo = "";
    if(this.superficie <70){
    tamanyo = "Vivienda pequeña";
    }
    else if (this.superficie <70 || this.superficie >95){
    tamanyo ="Vivienda mediana";
    }
    else{tamanyo = "Vivienda grande";}
    
    return tamanyo;
    
    }
    //EJERCICIO9
      /**
     * Te dice cual es la localidad segun la direccion
     * @return localidad 
     */
    public String getLocalidad() {
    String localidad ="";
    String[] a = this.direccion.split(",");
    if(a.length>1){
    localidad = a[1];
    }
    return localidad;
    }
    //EJERCICIO10
      /**
     * calcula la superficie total entre varias viviendas y las puede modificar
     * @return superficie total
     */
    public void getSuperficieTota(double[] superficiesEstancias) {
    double superficieTotal = 0;
    for (double superficieEstancia : superficiesEstancias) {
        superficieTotal += superficieEstancia;
    }
    this.superficie = superficieTotal;
}
    
    
    
    
    // SEGUNDO TRIMESTRE
    //EJERCICIO 3
    public boolean equals(Object o){
    boolean r = false;
        if (o instanceof Vivienda) {
            Vivienda v = (Vivienda) o;
            r = this.direccion == v.getDireccion();
        }
    return r;
    }
    //EJERCICIO 5
     /**
     * Da una exception si el precio es negativo
     * 
     */
    public void checkPrecio(double precio) throws PrecioNegativoException{
        if (precio < 0) {
            throw new PrecioNegativoException("Porfavor introduzca un precio valido");
        }
    }
    
}
