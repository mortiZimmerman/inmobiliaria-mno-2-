/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmobiliaria.mno;

/**
 *
 * @author calyp
 */
public class PisoImpl extends ViviendaImpl implements Piso{
    private int planta;
    private char puerta;
    
    public int getPlanta(){
    return planta;
    }

    public char getPuerta() {
        return this.puerta;
    }

    //EJERCICIO 6
     /**
     * Implemente para el tipo Piso un constructor que reciba un argumento para cada
        atributo.

     * 
     */
public PisoImpl(double superficie,double precio, Operacion operacion,String direccion,int planta,char puerta){
super(superficie,precio,operacion,direccion);
this.planta =  planta;
this.puerta = puerta;
}
    



    //EJERCICIO 4
        //El piso al ser heredado de viviendaImpl me parece que no se necesita hacer el euqlas ya que está hecho
        //corrijeme si me equivoco pero así lohicimos en el examen.



}
