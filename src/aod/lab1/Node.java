package aod.lab1;

/**
 * Representerar en nod i en länkad lista.
 *
 * Varje nod innehåller ett element och en referens
 * till nästa nod i listan.
 *
 * @param <T> typen av element i noden
 */
class Node<T> {
    T element;
    Node<T> next;

    Node(T element) {
        this.element = element;
        this.next = null;
    }
}