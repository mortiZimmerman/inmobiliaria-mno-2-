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
 /**
     * Dice si dos pisos son iguales segun sus propiedades
     * 
     */
        public boolean equals(Object o){
        boolean r = false;
            if ( o instanceof Piso) {
                 Piso p = (Piso) o;
                 r = super.equals(o) && this.planta == p.getPlanta() && this.puerta == p.getPuerta();
            }
        return r;
        }


}
