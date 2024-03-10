/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Catalogo;

import inmobiliaria.mno.Piso;
import java.util.List;

/**
 *
 * @author calyp
 */
public interface Catalogo {
   public List<Piso> getPisos();
      public void setPisos(List<Piso> pisos);
      public String pisosAlquierOVenta(String a, String v);
      public void agregarNuevoPiso(Piso nuevoPiso);
      public void quitarPisoExistente(Piso piso);
      public double sumaDePreciosPlanta(int planta);
      public String direccionMenorPrecio();
      public Catalogo filtrarPorPrecioYSuperficie(double p, double s);
      public void ordenarPorSuperficie();
      public String existePisoConPrecioMenor(double precio);
      public String todosPisosPorDebajoDePlanta(int planta);
      public void rebajarPrecioSuperficie(double s, double p);
      
      
}
