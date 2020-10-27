import java.util.*;

/**
 * DoubleLinkedList is a class that accepts generic data types and implements the List 
 * interface. The goal of this class is to create an ordered double-linked
 * list. The data types in contained in the list are integers, strings, and objects.
 * Both the head and the tail contain values instead of being null.
 * 
 * @Logan Sitar
 * @27 September 2019
 */
public class DoubleLinkedList<E> implements List<E>{
    private E element;
    private Node<E> next;
    private Node<E> previous;
    private Node<E> head;
    private Node<E> tail;
    private Node<E> current; 
    private Node<E> temp; 
    int total = 0;
    
    // constructor to create a new node with an assigned element
    DoubleLinkedList(E it, DoubleLinkedList<E> next, DoubleLinkedList<E> previous){
        element = it;
        next = next;
        previous = previous;
    }
    
    // constructor to create the first node in the list
    DoubleLinkedList(DoubleLinkedList<E> next, DoubleLinkedList<E> previous){
        next = null;
        previous = null;        
    }
    
    // Remove all contents from the list, so it is once again empty
    public void clear(){
        current = head;
        for (int i = 0; i < total; i++){
            current.setPrev(null);
            current = current.nextNode();
            if (current == null){
                head = tail = current;
            }
            else {
                current.prevNode().setNext(null);
            }
        }
        total = 0;
    }
    
    // insert a new generic data type into the list and set its
    // next and previous pointers so it is in order
    public boolean insert(E it){
        Node<E> link = new Node<E>(it, next, previous);
        if (head == null){
            head = link;
            current = link;
            tail = link;
            total++;            
            return true;
        }
        if (total == 1){
            Comparable c = (Comparable)current.element();
            Comparable l = (Comparable)link.element();
            if (c.compareTo(l) > 0){
                current.setPrev(link);
                link.setNext(current);
                head = link;
                current = link;
                total++;
                return true;
            }
            else if (l.compareTo(c) > 0){
                current.setNext(link);
                link.setPrev(current);
                tail = link;
                total++;
                return true;
            }
        }
        else {
            current = head;
            Comparable l = (Comparable)link.element(); 
            while (current != null){
                Comparable c = (Comparable)current.element();
                if (l.compareTo(c) > 0){
                    if (current.nextNode() == null){
                        tail = link;
                        link.setNext(null);
                        link.setPrev(current);
                        current.setNext(link);
                        current = current.nextNode();
                        total++;
                        return true;
                    }
                    current = current.nextNode();
                }
                else if (c.compareTo(l) > 0) {
                    if (current.prevNode() == null){
                        head = link;
                        link.setPrev(null);
                        link.setNext(current);
                        current.setPrev(link);
                        total++;
                        return true;
                    }
                    link.setPrev(current.prevNode());
                    current.prevNode().setNext(link);
                    link.setNext(current);
                    current.setPrev(link);
                    total++;
                    return true;
                }
            }
        }
        return false;
    }

    // Remove and return the current node's element and adjust necessary pointers
    public E remove(){
        current = tail;
        if (current == null){
            return null;
        }
        E it = current.element();
        current = tail = current.prevNode();
        current.setNext(null);
        total--;
        System.out.println("\nRemoving element at current position...");
        return it;
    }
    
    //return the index of the smallest element
    public int indexOfMin(){
        int count = 0;
        if (head == null){
            return -1;
        }
        else {
            return count;
        }
    }
    
    // Set the current position to the start(head) of the list
    public void moveToStart(){
        current = head;
        System.out.println("Current after moveToStart(head): " + current.element());
    }

    // Set the current position to the end(tail) of the list
    public void moveToEnd(){
        current = tail;
        System.out.println("Current after moveToEnd(tail): " + current.element());        
    }

    // Move the current position one step left, no change if already at beginning
    public void prev(){
        if (current == head || current.equals(head)){
            System.out.println("\nCurrent is at the beginning.");
        }
        else{
            current = current.prevNode();
        }
    }

    // Move the current position one step right, no change if already at end
    public void next(){
        if (current == tail || current.equals(tail)){
            System.out.println("\nCurrent is at the end.");
        }
        else{
            current = current.nextNode();
        } 
    }

    // Return the number of nodes in the linked list
    public int length(){
        return total;
    }

    // Return index of the current position
    public int currPos(){
        int count = 0;
        temp = head;
        while (temp != null){
            if (temp == current){
                return count;
            }
            temp = temp.nextNode();
            count++;
        }
        return count;
    }

    // Set the current position to desired "pos" if that position is smaller
    // than the total size of the list
    public boolean moveToPos(int pos){
        if (pos >= total){
            return false;
        }
        else {
            current = head;
            for (int i = 0; i <= pos; i++){
                current = current.nextNode();
            }
            return true;
        }
    }

    // Return true if current position is at end of the list
    public boolean isAtEnd(){
        if (current == tail || current.equals(tail)){
            return true;
        }
        return false;
    }

    // Return the current node's element
    public E getValue(){
        return current.element();
    }
  
    // Tell if the list is empty or not
    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }
    
    // print the elements in the linked list
    public void printDLinkList(){
        current = head;
        while (current != null ){
            if (current.nextNode() != null){
                System.out.print(current.element() + ", ");
            }
            else {
                System.out.print(current.element());                
            }
            current = current.nextNode();
        }
    }
}
