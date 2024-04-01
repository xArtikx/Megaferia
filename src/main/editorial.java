/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
class editorial {
    private String nit;
    private String nombre;
    private gerente gerente;
     private ArrayList<libro> libros;
     private ArrayList<stand> stands;

    public editorial(String nit, String nombre, gerente gerente, ArrayList<libro> libros, ArrayList<stand> stands) {
        this.nit = nit;
        this.nombre = nombre;
        this.gerente = gerente;
        this.libros = libros;
        this.stands = stands;
    }
     
}
