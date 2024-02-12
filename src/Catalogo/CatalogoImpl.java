/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import inmobiliaria.mno.Piso;

/**
 *
 * @author calyp
 */
public class CatalogoImpl implements Catalogo{
    private Piso listaDePisos[];

    public Piso[] getListaDePisos() {
        return listaDePisos;
    }

    public void setListaDePisos(Piso[] listaDePisos) {
        this.listaDePisos = listaDePisos;
    }


}
