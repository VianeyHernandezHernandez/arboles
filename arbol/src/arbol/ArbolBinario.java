/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author Alumno
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Arbol ar=new Arbol(23);
//    Nodo nuevo=new Nodo(14);
//    ar.agregar(nuevo,ar.getRaiz());

    ar.agregar(new Nodo(23), ar.getRaiz());
    ar.agregar(new Nodo(3), ar.getRaiz());
    ar.agregar(new Nodo(2), ar.getRaiz());
    ar.agregar(new Nodo(9), ar.getRaiz());
    ar.agregar(new Nodo(5), ar.getRaiz());
    ar.agregar(new Nodo(31), ar.getRaiz());
    
    ar.recorrerPreorden(ar.getRaiz());
  
    }
    
}
