/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import lista.ListaEnlazada.Node;

/**
 *
 * @author ENTRAR
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada listaEnlazada=new ListaEnlazada();
        listaEnlazada.insertar(2);
        listaEnlazada.insertar(3);
        listaEnlazada.insertar(4);
        listaEnlazada.insertar(6);
        listaEnlazada.insertar(8);
        listaEnlazada.insertar(8);
        listaEnlazada.insertar(8);
        listaEnlazada.insertar(7);
        listaEnlazada.insertar(7);
        listaEnlazada.insertar(7);
        Node e=listaEnlazada.data;
        listaEnlazada.eliminar();
        while(e!=null){
        System.out.println(e.info);
        e=e.next;
        }
    }
}
