/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import inmobiliaria.mno.Operacion;
import inmobiliaria.mno.Piso;
import inmobiliaria.mno.PisoImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author calyp
 */
public class CatalogoImpl implements Catalogo{
   private List<Piso> pisos;

    public CatalogoImpl() {
        this.pisos = new ArrayList<>();
    }

    public List<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(List<Piso> pisos) {
        this.pisos = pisos;
    }
     //EJERCICIO 7
     /**
     * Devuelve el numero de pisos segun si son de venta o de alquiler
     * 
     */
    public String pisosAlquierOVenta(String a, String v){
    int contador = 0;
    Operacion b = Operacion.valueOf(a.toUpperCase());
    Operacion c = Operacion.valueOf(v.toUpperCase());
    String prueba = "";
   
        for (Piso element:pisos) {
            if (element.getOperacion() == b) {
            prueba ="El numero de pisos en Alquiler es: " +  contador ++; 
                
            }else if (element.getOperacion() == c) {
               prueba ="El numero de pisos en Venta es: " +  contador ++; 
            }
        }
    return prueba;
    }
    
       //EJERCICIO 8
     /**
     * añade un piso a un catalogo
     * 
     */
public void agregarNuevoPiso(Piso nuevoPiso) {
        if (!pisos.contains(nuevoPiso)) {
            pisos.add(nuevoPiso);
            System.out.println("Nuevo piso agregado al catálogo con éxito.");
        } else {
            System.out.println("Error: No se pueden incluir dos pisos iguales en el catálogo.");
        }
    }
    
         //EJERCICIO 9
     /**
     * quita el piso de un catalogo
     * 
     */
public void quitarPisoExistente(Piso piso){

        if (!pisos.contains(piso)) {
            System.out.println("Error: El piso no se encuentra");
    }else{
        pisos.remove(piso);
            System.out.println("El piso ha sido eliminado del catálogo con éxitos");
        }



}   
     //EJERCICIO 10
     /**
     * devuleve la suma de los precios por planta
     * 
     */
public double sumaDePreciosPlanta(int planta){
double sumaDePrecios = 0;
    for (Piso piso:pisos) {
        if (piso.getPlanta() == planta) {
            sumaDePrecios += piso.getPrecio();
        }
    }
    return sumaDePrecios;
}
     //EJERCICIO 11
     /**
     * devuelve la direccion del piso con el menot precio/superficie
     * 
     */
public String direccionMenorPrecio(){

Piso p = pisos.get(0);

   for (Piso piso : pisos) {
            double superficieActual = piso.getPrecio() / piso.getSuperficie();
            double superficieMenor = p.getPrecio() /  p.getSuperficie();

            if (superficieActual < superficieMenor) {
                p = piso;
            }
        }

        return p.getDireccion();
    }

     //EJERCICIO 12
     /**
     * devuelve un catalogo con los pisos con superficie mayor que s y precio menor que p.
     * 
     */
public Catalogo filtrarPorPrecioYSuperficie(double p, double s) {
        Catalogo catalogoFiltrado = new CatalogoImpl() {};

        for (Piso piso : pisos) {
            if (piso.getSuperficie() > s && piso.getPrecio() < p) {
                catalogoFiltrado.agregarNuevoPiso(piso);
            }
        }

        return catalogoFiltrado;
    }
     //EJERCICIO 12+1
     /**
     * Oderna el catalogo por superficie
     * 
     */
public void ordenarPorSuperficie() {
        Collections.sort(pisos, Comparator.comparingDouble(Piso::getSuperficie));
}
     //EJERCICIO 14
     /**
     * devuelve si existen pisos con un precio menor a p
     * 
     */
public String existePisoConPrecioMenor(double precio) {
String s = "";
    for (Piso piso : pisos) {
            if (piso.getPrecio() < precio) {
                s = "Hay uno o mas pisos com un precio menor";
            }else{
            s = "No hay ningun piso con un precio menor";
            }
        }
    return s;
}
     //EJERCICIO 15
     /**
     * devuelve si todos los pisos estan por debajo de una planta
     * 
     */
    public String todosPisosPorDebajoDePlanta(int planta) {
        String s = "";
        for (Piso piso : pisos) {
            if (piso.getPlanta() >= planta) {
                s = "Hay uno o mas pisos por encima de esa planta";
            }else{
            s = "Todos los pisos estan por debajo de la planta";
            }
        }
    return s;
    }

     //EJERCICIO 16
     /**
     * realiza una rebaja al precio a los pisos con una superficie mayor a p
     * 
     */
 public void rebajarPrecioSuperficie(double s, double p) {
        for (Piso piso : pisos) {
            if (piso.getSuperficie() > s) {
                double descuento = piso.getPrecio() * (p / 100.0);
                piso.setPrecio(piso.getPrecio() - descuento);
            }
        }
    }







}


















    

