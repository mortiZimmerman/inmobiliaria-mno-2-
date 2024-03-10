/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inmobiliaria.mno;

/**
 *
 * @author mauricio
 */
public interface Vivienda {
    public double getSuperficie();
    public double getPrecio();
    public Operacion getOperacion();
    public String getDireccion();
    public void setSuperficie(double superficie);
    public void setPrecio(double precio);
    public void setOperacion(Operacion operacion);
    public void setDireccion(String direccion);
    public double getRebaja();
    public boolean esUnaOperacion(Operacion operacion);
    public double getComision();
    public double getCalcularPrecioMetroCuadrado();
    public String getcomparadorDeViviendas(Vivienda otraVivienda);
    public String getTamanyoVivienda();
    public String getLocalidad();
    public void getSuperficieTota(double[] superficiesEstancias);
    
}
