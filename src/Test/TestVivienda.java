/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;
import Catalogo.Catalogo;
import Catalogo.CatalogoImpl;
import inmobiliaria.mno.Operacion;
import inmobiliaria.mno.Vivienda;
import inmobiliaria.mno.ViviendaImpl;
import java.util.Scanner;
/**
 *
 * @author mauricio
 */
public class TestVivienda {
    public static void main(String[] args) {
       //EJERCICIO11.1
      Vivienda v1 = new ViviendaImpl(80,850,Operacion.ALQUILER," Calle Gongora nº 58  - 4ºB, Cordoba"); 
      //EJERCICIO11.2
      Vivienda v2 = new ViviendaImpl();
      //EJERCICIO11.3
      Vivienda v3 = new ViviendaImpl("");
        //EJERCICIO11.4
      Scanner sc = new Scanner(System.in);
        
        System.out.println("Cual es la superficie?");
        v2.setSuperficie(sc.nextDouble());
        sc.nextLine();
        System.out.println("Cual es el precio?");  
        v2.setPrecio(sc.nextDouble());
        sc.nextLine();
        System.out.println("Cual es la direccion?");
        v2.setDireccion(sc.nextLine());
        v2.setOperacion(Operacion.VENTA);
        System.out.println("Los datos de la vivienda introducida son: " + "Superficie: "+ v2.getSuperficie() + " Precio: "+ v2.getPrecio() + " Direccion: "+ v2.getDireccion() + " Operacion: " + v2.getOperacion());
        //EJERCICIO11.5
        v3.setDireccion(" Plaza de las flores nº 24, Úbeda");        System.out.println("el precio final con la rebaja aplicada es: "+ v1.getRebaja()); 

        //EJERCICIO11.6
        System.out.println("el precio final con la rebaja aplicada es: "+ v1.getRebaja()); 
        //parte 1 finalizada y corregida
        //parte 2
        //EJERCICIO11.7
        System.out.println("La comision por venta es de : " +v2.getComision());
        //EJERCICIO11.8
        System.out.println("El precio por metro cuadrado de v2 es: " + v2.getCalcularPrecioMetroCuadrado());
        //EJERCICIO11.9
        System.out.println("La localidad de v1 es : " + v1.getLocalidad());
         //EJERCICIO11.10
        System.out.println("Cual tiene mayor precio?: " + v2.getcomparadorDeViviendas(v3));
        //EJERCICIO11.11
        System.out.println("Cual tiene mayor precio?: " + v1.getcomparadorDeViviendas(v3));
        //EJERCICIO11.12
        System.out.println("Que tamaño tiene la vivienda v3? :" + v3.getTamanyoVivienda());
        //EJERCICIO11.13
        System.out.println("Cual tiene mayor precio por metro cuadrado?: " + v1.getcomparadorDeViviendas(v3));
        //System.out.println("");
    
         Catalogo catalogo = new CatalogoImpl();


        
        
        
        
        
        
        
        
        
        
        
    
    }
   
}
