
/**
 * "Hello World" program generalized to be able to write any string.
 * The one prints out two text strings in two different ways.
 *
 * @author ykdc
 * @version 1.0
 */
public class HelloWorldWriter
{
     public static void main(String[] args) {
        TextWriter tw1; // variable named tw1 whose type is TextWriter
         
        // create a new TextWriter object & call default constructor
        tw1 = new TextWriter(); // want variable to refer to an object
        
        tw1.setTextToDisplay("Hello World!");
        tw1.display(); // print text
        
        TextWriter tw2 = new TextWriter("Again, Hello!!");
        System.out.println(tw2.getTextToDisplay()); // another way to print text
    }
}
