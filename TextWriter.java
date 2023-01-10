
/**
 * TextWriter is a class that will store & display any text string.
 *
 * @author ykdc
 * @version 1.0
 */
public class TextWriter
{
    private String textToDisplay;  // the text to be displayed
     
    // default constructor initializes object with empty string
    public TextWriter() {
        textToDisplay = "";
    }
    
    // constructor initializes object with string is in parameter
    public TextWriter(String inputText) {
        textToDisplay = inputText;
    }
    
    
    // store string to display
    public void setTextToDisplay(String inputText) {
        textToDisplay = inputText;
    }
    
    // get stored value
    public String getTextToDisplay() {  //
        return textToDisplay;
    }
    
    // clear value
    public void clearTexttoDisplay() {
        textToDisplay = "";
    }
    
    // display stored value
    public void display() {
        System.out.println(textToDisplay);
    }

}
