/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author ENTRAR
 */
public class ListaEnlazada {

    public class Node {

        Node next;
        int info;
    }
    Node data;

    public void insertar(int elemento) {
        Node node = new Node();
        node.info = elemento;
        node.next = data;
        data = node;
    }

    public void eliminar() {
        Node aux = data;
        Node prev = null;
        while (aux != null) {
            if (aux.info % 2 == 0) {
                if (data == aux) {
                    data = data.next;
                } else {
                    prev.next = aux.next;
                }
            } else {
                prev = aux;
            }
            aux = aux.next;
        }
    }
}
