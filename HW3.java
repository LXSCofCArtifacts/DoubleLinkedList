
/**
 * Main to test lists containing integers, strings, and objects. There is 
 * a call for each method in the class DoubleLinkedList to test each one.
 *
 * @Logan Sitar
 * @27 September 2019
 */
public class HW3
{
    public static void main (String args[]){
        System.out.println("Welcome to my Double-Linked String List examples!!");        
        DoubleLinkedList strChain = new DoubleLinkedList(null, null);
        System.out.println("The list is empty: " + strChain.isEmpty());
        System.out.println();                
        strChain.insert("hey");
        strChain.insert("you");
        strChain.clear();
        strChain.printDLinkList();
        strChain.insert("people");
        strChain.insert("zebra");
        strChain.insert("apple");
        strChain.insert("banana");
        strChain.insert("mango");
        strChain.insert("tangerine");        
        strChain.insert("pear");
        strChain.insert("danish");
        strChain.printDLinkList();
        System.out.println();        
        strChain.remove();
        strChain.printDLinkList();
        System.out.println("\n");        
        strChain.insert("surf");
        strChain.insert("cranberry");
        strChain.printDLinkList();
        System.out.println();
        strChain.remove();
        strChain.printDLinkList();
        System.out.println("\n");
        System.out.println("The list is empty: " + strChain.isEmpty());
        strChain.moveToStart();
        strChain.moveToEnd();
        System.out.println("Length of List: " + strChain.length());
        System.out.print("Move current to a desired location in the listSize - 1... ");
        strChain.moveToPos(3);
        System.out.println("Current = " + strChain.getValue());        
        System.out.println("Index of Min: " + strChain.indexOfMin());
        System.out.println("Location of current: " + strChain.currPos());

        System.out.println();
        System.out.println("Welcome to my Double-Linked Integer List examples!!");               
        DoubleLinkedList intChain = new DoubleLinkedList(null, null);
        System.out.println("The list is empty: " + intChain.isEmpty());
        System.out.println();         
        intChain.insert(44);
        intChain.insert(1000);
        intChain.insert(35);
        intChain.insert(333);
        intChain.insert(1);
        intChain.insert(8);
        intChain.insert(56);
        intChain.insert(989);
        intChain.printDLinkList();
        System.out.println();
        intChain.remove();
        intChain.printDLinkList();
        System.out.println();        
        intChain.remove();
        intChain.printDLinkList(); 
        System.out.println("\n");
        System.out.println("The list is empty: " + intChain.isEmpty());
        intChain.moveToStart();
        intChain.moveToEnd();
        System.out.println("Length of List: " + intChain.length());
        System.out.print("Move current to a desired location in the listSize - 1... ");
        intChain.moveToPos(2);
        System.out.println("Current = " + intChain.getValue());        
        System.out.println("Index of Min: " + intChain.indexOfMin());
        System.out.println("Location of current: " + intChain.currPos());         

        System.out.println();
        System.out.println("Welcome to my Double-Linked Object List examples!!");                       
        DoubleLinkedList objChain = new DoubleLinkedList(null, null);
        Person p1 = new Person("Logan", 20);
        objChain.insert(p1.toString());
        Person p2 = new Person("Jeffery", 35);
        objChain.insert(p2.toString());       
        Person p3 = new Person("Jerry", 31);
        objChain.insert(p3.toString());
        Person p4 = new Person("Alex", 54);
        objChain.insert(p4.toString()); 
        Person p5 = new Person("Ellie", 27);
        objChain.insert(p5.toString()); 
        Person p6 = new Person("Kyle", 60);
        objChain.insert(p6.toString());         
        objChain.printDLinkList();
        System.out.println();        
        objChain.remove();
        objChain.printDLinkList();  
        System.out.println("\n");
        System.out.println("The list is empty: " + objChain.isEmpty());
        objChain.moveToStart();
        objChain.moveToEnd();
        System.out.println("Length of List: " + objChain.length());
        System.out.print("Move current to a desired location in the listSize - 1... ");
        objChain.moveToPos(2);
        System.out.println("Current = " + objChain.getValue());        
        System.out.println("Index of Min: " + objChain.indexOfMin());
        System.out.println("Location of current: " + objChain.currPos());

    }
}
