
/**
 * Person class containing a name and age to test the DoubleLinkedList
 * with objects.
 *
 * @Logan
 * @3 October 2019
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;

    public Person(String name, int age)
    {
        // initialise instance variables
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String toString(){
        return age + "-" + name;
    }
}
