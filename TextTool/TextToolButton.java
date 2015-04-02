
package TextTool;

import javax.swing.JButton;

/**
 * @brief TextTool usage of Swing JButton
 * @author GAPer
 */
public class TextToolButton extends JButton{
    String ButtonIdentificator;//Unique identification for the button
    
    //C-tor
    public TextToolButton(String name)
    {
        
    }
    
    private void  SetButtonIdentificator(String ButtonIdentificator)
    {
        this.ButtonIdentificator = ButtonIdentificator != null 
                ? ButtonIdentificator : "";
    }
}
