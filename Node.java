/**
 * Node class which DoubleLinkedList uses methods from in its algorithms.
 *
 * @Logan Sitar
 * @3 October 2019
 */
public class Node<E> {         // Doubly linked list node
  private E e;          // Value for this node
  private Node<E> n;    // Pointer to next node in list
  private Node<E> p;    // Pointer to previous node

  // Constructors
  Node(E it, Node<E> n, Node<E> p) {
      e = it;
      p = p;
      n = n;
    }
    
  Node(Node<E> n, Node<E> p) {
      p = p; n = n; 
    }

  // Get and set methods for the data members
  public E element() { 
      return e;
    }                                // Return the value
    
  public E setElement(E it) { 
      return e = it; 
    }                    // Set element value
    
  public Node<E> nextNode() { 
      return n;
    }                             // Return next link
    
  public Node<E> setNext(Node<E> nextval) {
      return n = nextval; 
    } // Set next link
    
  public Node<E> prevNode() { 
      return p;
    }               // Return prev link
    
  public Node<E> setPrev(Node<E> prevval) { 
      return p = prevval; 
    } // Set prev link
    
}
